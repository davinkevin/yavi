/*
 * Copyright (C) 2018 Toshiaki Maki <makingx@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package am.ik.yavi.core;

import java.util.Collection;
import java.util.function.Function;

public class CollectionValidator<T, N extends Collection<E>, E> {
	private final Function<T, N> toCollection;
	private final String name;
	private final Validator<E> validator;

	public CollectionValidator(Function<T, N> toCollection, String name,
							   Validator<E> validator) {
		this.toCollection = toCollection;
		this.name = name;
		this.validator = validator;
	}

	public Function<T, N> toCollection() {
		return this.toCollection;
	}

	public String name() {
		return this.name;
	}

	public Validator<E> validator() {
		return this.validator;
	}
}