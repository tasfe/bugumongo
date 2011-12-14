/**
 * Copyright (c) www.bugull.com
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.bugull.mongo.mapper;

import java.lang.reflect.Field;
import org.apache.log4j.Logger;

/**
 *
 * @author Frank Wen(xbwen@hotmail.com)
 */
public class FieldUtil {
    
    private final static Logger logger = Logger.getLogger(FieldUtil.class);
    
    public static Object get(Object obj, Field f){
        Object value = null;
        try {
            value = f.get(obj);
        } catch (IllegalArgumentException ex) {
            logger.error(ex.getMessage());
        } catch (IllegalAccessException ex) {
            logger.error(ex.getMessage());
        }
        return value;
    }
    
    public static void set(Object obj, Field f, Object value){
        try{
            f.set(obj, value);
        }catch(IllegalArgumentException ex){
            logger.error(ex.getMessage());
        }catch(IllegalAccessException ex){
            logger.error(ex.getMessage());
        }
    }
    
}