/*
 * Copyright (c) 2013 the original author or authors.
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
 */
package org.openinfinity.domain.repository;

import org.openinfinity.domain.entity.Product;

import java.util.Collection;

/**
 * Product repository interface.
 * 
 * @author Ilkka Leinonen
 */
public interface CRUDRepository<T extends RepositoryItem> {

	public String create(T item);
	
	public void update(T item);
	
	public Collection<T> loadAll();
	
	public T loadById(String id);

	public void delete(T item);
	
}
