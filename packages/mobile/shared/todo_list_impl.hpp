//
//  todo_list_impl.hpp
//  mobile
//
//  Created by Blain on 6/15/18.
//  Copyright © 2018 Facebook. All rights reserved.
//

#pragma once

#include "todo_list.hpp"
#include "todo.hpp"

namespace helloworld {
  
  class TodoListImpl : public TodoList {
    
  public:
    
    // Constructor
    TodoListImpl(const std::string & path);
    
    // Database functions we need to implement in C++
    std::vector<Todo> get_todos();
    int32_t add_todo(const std::string & label);
    bool update_todo_completed(int32_t id, int32_t completed);
    bool delete_todo(int32_t id);
    
  private:
    
    void _setup_db();
    void _setup_db2();
    void _handle_query(std::string query);
    
  };
  
}
