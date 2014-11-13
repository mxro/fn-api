package de.mxro.fn.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class CollectionsUtils {

    public final static <GPOutput> boolean isMapComplete(final Map<Integer, GPOutput> map, final int size) {
        for (int i = 0; i < size; i++) {
            if (map.get(Integer.valueOf(i)) == null) {
                return false;
            }
        }
        return true;
    }

    public final static <GOutput> List<GOutput> toOrderedList(final Map<Integer, GOutput> responseMap) {
        final List<GOutput> localResponses = new ArrayList<GOutput>(responseMap.size());
        for (int i = 0; i < responseMap.size(); i++) {
            final GOutput rr = responseMap.get(Integer.valueOf(i));

            assert rr != null;

            localResponses.add(rr);
        }
        return localResponses;
    }

    /**
     * Flattens the provided list into a single list.
     * 
     * @param lists
     * @return
     */
    public final static <V> List<V> flatten(final List<List<V>> lists) {

        int size = 0;

        for (final List<V> list : lists) {
            size += list.size();
        }

        final List<V> res = new ArrayList<V>(size);

        for (final List<V> list : lists) {
            res.addAll(list);
        }

        return res;

    }

}
