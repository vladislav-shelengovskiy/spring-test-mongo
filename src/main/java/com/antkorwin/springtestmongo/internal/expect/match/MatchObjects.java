package com.antkorwin.springtestmongo.internal.expect.match;

/**
 * Created on 19.12.2018.
 *
 * Simple matcher to match two {@link Object} (based on equals)
 *
 * @author Korovin Anatoliy
 */
public class MatchObjects implements MatchData {

    @Override
    public boolean match(Object original, Object expected) {
        return expected.equals(original);
    }
}
