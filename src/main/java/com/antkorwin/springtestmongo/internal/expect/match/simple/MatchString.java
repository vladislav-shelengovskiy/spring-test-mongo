package com.antkorwin.springtestmongo.internal.expect.match.simple;

import com.antkorwin.springtestmongo.internal.expect.match.MatchData;

/**
 * Created on 19.12.2018.
 * <p>
 * Match one string value to another
 *
 * @author Korovin Anatoliy
 */
public class MatchString implements MatchData {

    @Override
    public boolean match(Object original, Object expected) {
        return expected.equals(original);
    }
}
