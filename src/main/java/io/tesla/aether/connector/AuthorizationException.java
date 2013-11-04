/**
 * Copyright (c) 2012 to original author or authors
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package io.tesla.aether.connector;

class AuthorizationException
    extends Exception
{

    public AuthorizationException( final String message )
    {
        super( message );
    }

    public AuthorizationException( final String message, final Throwable cause )
    {
        super( message, cause );
    }

}
