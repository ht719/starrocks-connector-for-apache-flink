/*
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
 */

package com.starrocks.connector.flink.table.sink;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StarRocksSinkDynamicRowDataWithMeta implements Serializable {

    private static final long serialVersionUID = 1L;

    private String table;
    private String database;
    private Map<String, Object> map = new HashMap<>();

    public String getTable() {
        return table;
    }
    public void setTable(String table) {
        this.table = table;
    }
    public String getDatabase() {
        return database;
    }
    public void setDatabase(String database) {
        this.database = database;
    }
    public Map<String, Object> getMap() {
        return map;
    }
    public void setMap(Map<String, Object> map) {
        this.map = map;
    }
}
