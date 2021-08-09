/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package groupid.model.presentation.customer;

import groupid.helpers.StringEnumSerializer;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(using=StringEnumSerializer.class)
public enum FamilyNameVO {
    ALL, 
    PERSONAL_ACCOUNT, 
    CREDIT_CARDS,
    SAVING_ACCOUNT,
    MORTGAGES_AND_LOANS, 
    UNIT_LINKED, 
    SECURITIES_AND_FINANCIAL_ASSETS, 
    INVESTMENTS_INSURANCES, 
    PENSION_PLANS, 
    INSURANCES
}
