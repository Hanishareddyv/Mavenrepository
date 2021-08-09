/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package groupid.model.business.common;

import groupid.helpers.StringEnumSerializer;
import org.codehaus.jackson.map.annotate.JsonSerialize;

/**
 *
 * @author maps
 */
@JsonSerialize(using=StringEnumSerializer.class)
public enum Pagination {
    First, Previous, Next
}
