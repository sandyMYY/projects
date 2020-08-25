package com.za.baowatools.dal.generator;

import org.apache.commons.lang.StringUtils;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by za-chenlin001 on 2019/4/15.
 */
public class GeneratorUtils {

    /**
     * 将字符串以分隔符分隔成Set
     *
     * @param source
     * @param separator
     * @return
     */
    public static Set<String> splitToSet(String source, String separator) {
        Set<String> result = new HashSet<String>();
        if (StringUtils.isNotBlank(source)) {
            String[] splits = source.split(separator);
            for (String split : splits) {
                String trimmed = split.trim();
                if (trimmed.length() > 0) {
                    result.add(trimmed);
                }
            }
        }
        return result;
    }
}
