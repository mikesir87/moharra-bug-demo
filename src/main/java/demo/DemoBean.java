/*
 * File created on Oct 2, 2014 
 *
 * Copyright (c) 2014 Virginia Polytechnic Institute and State University
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package demo;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 * A demo bean.
 *
 * @author Micjael Irwin
 */
@Named
@RequestScoped
public class DemoBean {

  private String name;

  public String submit() {
    System.out.println("Thanks!");
    return "success";
  }
  
  /**
   * Gets the {@code name} property.
   * @return property value
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the {@code name} property.
   * @param name the value to set
   */
  public void setName(String name) {
    this.name = name;
  }
  
}
