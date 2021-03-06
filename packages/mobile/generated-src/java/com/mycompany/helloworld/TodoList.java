// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from helloworld.djinni

package com.mycompany.helloworld;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class TodoList {
    public abstract ArrayList<Todo> getTodos();

    public abstract int addTodo(String label);

    public abstract boolean updateTodoCompleted(int id, int completed);

    public abstract boolean deleteTodo(int id);

    public static native TodoList createWithPath(String path);

    private static final class CppProxy extends TodoList
    {
        private final long nativeRef;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);

        private CppProxy(long nativeRef)
        {
            if (nativeRef == 0) throw new RuntimeException("nativeRef is zero");
            this.nativeRef = nativeRef;
        }

        private native void nativeDestroy(long nativeRef);
        public void destroy()
        {
            boolean destroyed = this.destroyed.getAndSet(true);
            if (!destroyed) nativeDestroy(this.nativeRef);
        }
        protected void finalize() throws java.lang.Throwable
        {
            destroy();
            super.finalize();
        }

        @Override
        public ArrayList<Todo> getTodos()
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_getTodos(this.nativeRef);
        }
        private native ArrayList<Todo> native_getTodos(long _nativeRef);

        @Override
        public int addTodo(String label)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_addTodo(this.nativeRef, label);
        }
        private native int native_addTodo(long _nativeRef, String label);

        @Override
        public boolean updateTodoCompleted(int id, int completed)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_updateTodoCompleted(this.nativeRef, id, completed);
        }
        private native boolean native_updateTodoCompleted(long _nativeRef, int id, int completed);

        @Override
        public boolean deleteTodo(int id)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_deleteTodo(this.nativeRef, id);
        }
        private native boolean native_deleteTodo(long _nativeRef, int id);
    }
}
