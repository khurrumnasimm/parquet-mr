/**
 * Copyright 2012 Twitter, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package parquet.pig;

import parquet.ParquetRuntimeException;

public class TupleConversionException extends ParquetRuntimeException {
  private static final long serialVersionUID = 1L;

  public TupleConversionException() {
    super();
  }

  public TupleConversionException(String message, Throwable cause) {
    super(message, cause);
  }

  public TupleConversionException(String message) {
    super(message);
  }

  public TupleConversionException(Throwable cause) {
    super(cause);
  }

}
