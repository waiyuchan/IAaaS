package com.gbtech.iaaas.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AcInvoiceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AcInvoiceExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFeeOrderIdIsNull() {
            addCriterion("fee_order_id is null");
            return (Criteria) this;
        }

        public Criteria andFeeOrderIdIsNotNull() {
            addCriterion("fee_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andFeeOrderIdEqualTo(Integer value) {
            addCriterion("fee_order_id =", value, "feeOrderId");
            return (Criteria) this;
        }

        public Criteria andFeeOrderIdNotEqualTo(Integer value) {
            addCriterion("fee_order_id <>", value, "feeOrderId");
            return (Criteria) this;
        }

        public Criteria andFeeOrderIdGreaterThan(Integer value) {
            addCriterion("fee_order_id >", value, "feeOrderId");
            return (Criteria) this;
        }

        public Criteria andFeeOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("fee_order_id >=", value, "feeOrderId");
            return (Criteria) this;
        }

        public Criteria andFeeOrderIdLessThan(Integer value) {
            addCriterion("fee_order_id <", value, "feeOrderId");
            return (Criteria) this;
        }

        public Criteria andFeeOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("fee_order_id <=", value, "feeOrderId");
            return (Criteria) this;
        }

        public Criteria andFeeOrderIdIn(List<Integer> values) {
            addCriterion("fee_order_id in", values, "feeOrderId");
            return (Criteria) this;
        }

        public Criteria andFeeOrderIdNotIn(List<Integer> values) {
            addCriterion("fee_order_id not in", values, "feeOrderId");
            return (Criteria) this;
        }

        public Criteria andFeeOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("fee_order_id between", value1, value2, "feeOrderId");
            return (Criteria) this;
        }

        public Criteria andFeeOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("fee_order_id not between", value1, value2, "feeOrderId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andMachineCodeIsNull() {
            addCriterion("machine_code is null");
            return (Criteria) this;
        }

        public Criteria andMachineCodeIsNotNull() {
            addCriterion("machine_code is not null");
            return (Criteria) this;
        }

        public Criteria andMachineCodeEqualTo(String value) {
            addCriterion("machine_code =", value, "machineCode");
            return (Criteria) this;
        }

        public Criteria andMachineCodeNotEqualTo(String value) {
            addCriterion("machine_code <>", value, "machineCode");
            return (Criteria) this;
        }

        public Criteria andMachineCodeGreaterThan(String value) {
            addCriterion("machine_code >", value, "machineCode");
            return (Criteria) this;
        }

        public Criteria andMachineCodeGreaterThanOrEqualTo(String value) {
            addCriterion("machine_code >=", value, "machineCode");
            return (Criteria) this;
        }

        public Criteria andMachineCodeLessThan(String value) {
            addCriterion("machine_code <", value, "machineCode");
            return (Criteria) this;
        }

        public Criteria andMachineCodeLessThanOrEqualTo(String value) {
            addCriterion("machine_code <=", value, "machineCode");
            return (Criteria) this;
        }

        public Criteria andMachineCodeLike(String value) {
            addCriterion("machine_code like", value, "machineCode");
            return (Criteria) this;
        }

        public Criteria andMachineCodeNotLike(String value) {
            addCriterion("machine_code not like", value, "machineCode");
            return (Criteria) this;
        }

        public Criteria andMachineCodeIn(List<String> values) {
            addCriterion("machine_code in", values, "machineCode");
            return (Criteria) this;
        }

        public Criteria andMachineCodeNotIn(List<String> values) {
            addCriterion("machine_code not in", values, "machineCode");
            return (Criteria) this;
        }

        public Criteria andMachineCodeBetween(String value1, String value2) {
            addCriterion("machine_code between", value1, value2, "machineCode");
            return (Criteria) this;
        }

        public Criteria andMachineCodeNotBetween(String value1, String value2) {
            addCriterion("machine_code not between", value1, value2, "machineCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceCodeIsNull() {
            addCriterion("invoice_code is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceCodeIsNotNull() {
            addCriterion("invoice_code is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceCodeEqualTo(String value) {
            addCriterion("invoice_code =", value, "invoiceCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceCodeNotEqualTo(String value) {
            addCriterion("invoice_code <>", value, "invoiceCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceCodeGreaterThan(String value) {
            addCriterion("invoice_code >", value, "invoiceCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_code >=", value, "invoiceCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceCodeLessThan(String value) {
            addCriterion("invoice_code <", value, "invoiceCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceCodeLessThanOrEqualTo(String value) {
            addCriterion("invoice_code <=", value, "invoiceCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceCodeLike(String value) {
            addCriterion("invoice_code like", value, "invoiceCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceCodeNotLike(String value) {
            addCriterion("invoice_code not like", value, "invoiceCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceCodeIn(List<String> values) {
            addCriterion("invoice_code in", values, "invoiceCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceCodeNotIn(List<String> values) {
            addCriterion("invoice_code not in", values, "invoiceCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceCodeBetween(String value1, String value2) {
            addCriterion("invoice_code between", value1, value2, "invoiceCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceCodeNotBetween(String value1, String value2) {
            addCriterion("invoice_code not between", value1, value2, "invoiceCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberIsNull() {
            addCriterion("invoice_number is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberIsNotNull() {
            addCriterion("invoice_number is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberEqualTo(String value) {
            addCriterion("invoice_number =", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberNotEqualTo(String value) {
            addCriterion("invoice_number <>", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberGreaterThan(String value) {
            addCriterion("invoice_number >", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_number >=", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberLessThan(String value) {
            addCriterion("invoice_number <", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberLessThanOrEqualTo(String value) {
            addCriterion("invoice_number <=", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberLike(String value) {
            addCriterion("invoice_number like", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberNotLike(String value) {
            addCriterion("invoice_number not like", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberIn(List<String> values) {
            addCriterion("invoice_number in", values, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberNotIn(List<String> values) {
            addCriterion("invoice_number not in", values, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberBetween(String value1, String value2) {
            addCriterion("invoice_number between", value1, value2, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberNotBetween(String value1, String value2) {
            addCriterion("invoice_number not between", value1, value2, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andCheckCodeIsNull() {
            addCriterion("check_code is null");
            return (Criteria) this;
        }

        public Criteria andCheckCodeIsNotNull() {
            addCriterion("check_code is not null");
            return (Criteria) this;
        }

        public Criteria andCheckCodeEqualTo(String value) {
            addCriterion("check_code =", value, "checkCode");
            return (Criteria) this;
        }

        public Criteria andCheckCodeNotEqualTo(String value) {
            addCriterion("check_code <>", value, "checkCode");
            return (Criteria) this;
        }

        public Criteria andCheckCodeGreaterThan(String value) {
            addCriterion("check_code >", value, "checkCode");
            return (Criteria) this;
        }

        public Criteria andCheckCodeGreaterThanOrEqualTo(String value) {
            addCriterion("check_code >=", value, "checkCode");
            return (Criteria) this;
        }

        public Criteria andCheckCodeLessThan(String value) {
            addCriterion("check_code <", value, "checkCode");
            return (Criteria) this;
        }

        public Criteria andCheckCodeLessThanOrEqualTo(String value) {
            addCriterion("check_code <=", value, "checkCode");
            return (Criteria) this;
        }

        public Criteria andCheckCodeLike(String value) {
            addCriterion("check_code like", value, "checkCode");
            return (Criteria) this;
        }

        public Criteria andCheckCodeNotLike(String value) {
            addCriterion("check_code not like", value, "checkCode");
            return (Criteria) this;
        }

        public Criteria andCheckCodeIn(List<String> values) {
            addCriterion("check_code in", values, "checkCode");
            return (Criteria) this;
        }

        public Criteria andCheckCodeNotIn(List<String> values) {
            addCriterion("check_code not in", values, "checkCode");
            return (Criteria) this;
        }

        public Criteria andCheckCodeBetween(String value1, String value2) {
            addCriterion("check_code between", value1, value2, "checkCode");
            return (Criteria) this;
        }

        public Criteria andCheckCodeNotBetween(String value1, String value2) {
            addCriterion("check_code not between", value1, value2, "checkCode");
            return (Criteria) this;
        }

        public Criteria andEntryIsNull() {
            addCriterion("entry is null");
            return (Criteria) this;
        }

        public Criteria andEntryIsNotNull() {
            addCriterion("entry is not null");
            return (Criteria) this;
        }

        public Criteria andEntryEqualTo(String value) {
            addCriterion("entry =", value, "entry");
            return (Criteria) this;
        }

        public Criteria andEntryNotEqualTo(String value) {
            addCriterion("entry <>", value, "entry");
            return (Criteria) this;
        }

        public Criteria andEntryGreaterThan(String value) {
            addCriterion("entry >", value, "entry");
            return (Criteria) this;
        }

        public Criteria andEntryGreaterThanOrEqualTo(String value) {
            addCriterion("entry >=", value, "entry");
            return (Criteria) this;
        }

        public Criteria andEntryLessThan(String value) {
            addCriterion("entry <", value, "entry");
            return (Criteria) this;
        }

        public Criteria andEntryLessThanOrEqualTo(String value) {
            addCriterion("entry <=", value, "entry");
            return (Criteria) this;
        }

        public Criteria andEntryLike(String value) {
            addCriterion("entry like", value, "entry");
            return (Criteria) this;
        }

        public Criteria andEntryNotLike(String value) {
            addCriterion("entry not like", value, "entry");
            return (Criteria) this;
        }

        public Criteria andEntryIn(List<String> values) {
            addCriterion("entry in", values, "entry");
            return (Criteria) this;
        }

        public Criteria andEntryNotIn(List<String> values) {
            addCriterion("entry not in", values, "entry");
            return (Criteria) this;
        }

        public Criteria andEntryBetween(String value1, String value2) {
            addCriterion("entry between", value1, value2, "entry");
            return (Criteria) this;
        }

        public Criteria andEntryNotBetween(String value1, String value2) {
            addCriterion("entry not between", value1, value2, "entry");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNull() {
            addCriterion("quantity is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("quantity is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(String value) {
            addCriterion("quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(String value) {
            addCriterion("quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(String value) {
            addCriterion("quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(String value) {
            addCriterion("quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(String value) {
            addCriterion("quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(String value) {
            addCriterion("quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLike(String value) {
            addCriterion("quantity like", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotLike(String value) {
            addCriterion("quantity not like", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<String> values) {
            addCriterion("quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<String> values) {
            addCriterion("quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(String value1, String value2) {
            addCriterion("quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(String value1, String value2) {
            addCriterion("quantity not between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Integer value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Integer value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Integer value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Integer value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Integer value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Integer> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Integer> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Integer value1, Integer value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andInvoiceFeeIsNull() {
            addCriterion("invoice_fee is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceFeeIsNotNull() {
            addCriterion("invoice_fee is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceFeeEqualTo(Integer value) {
            addCriterion("invoice_fee =", value, "invoiceFee");
            return (Criteria) this;
        }

        public Criteria andInvoiceFeeNotEqualTo(Integer value) {
            addCriterion("invoice_fee <>", value, "invoiceFee");
            return (Criteria) this;
        }

        public Criteria andInvoiceFeeGreaterThan(Integer value) {
            addCriterion("invoice_fee >", value, "invoiceFee");
            return (Criteria) this;
        }

        public Criteria andInvoiceFeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("invoice_fee >=", value, "invoiceFee");
            return (Criteria) this;
        }

        public Criteria andInvoiceFeeLessThan(Integer value) {
            addCriterion("invoice_fee <", value, "invoiceFee");
            return (Criteria) this;
        }

        public Criteria andInvoiceFeeLessThanOrEqualTo(Integer value) {
            addCriterion("invoice_fee <=", value, "invoiceFee");
            return (Criteria) this;
        }

        public Criteria andInvoiceFeeIn(List<Integer> values) {
            addCriterion("invoice_fee in", values, "invoiceFee");
            return (Criteria) this;
        }

        public Criteria andInvoiceFeeNotIn(List<Integer> values) {
            addCriterion("invoice_fee not in", values, "invoiceFee");
            return (Criteria) this;
        }

        public Criteria andInvoiceFeeBetween(Integer value1, Integer value2) {
            addCriterion("invoice_fee between", value1, value2, "invoiceFee");
            return (Criteria) this;
        }

        public Criteria andInvoiceFeeNotBetween(Integer value1, Integer value2) {
            addCriterion("invoice_fee not between", value1, value2, "invoiceFee");
            return (Criteria) this;
        }

        public Criteria andTaxRateIsNull() {
            addCriterion("tax_rate is null");
            return (Criteria) this;
        }

        public Criteria andTaxRateIsNotNull() {
            addCriterion("tax_rate is not null");
            return (Criteria) this;
        }

        public Criteria andTaxRateEqualTo(Float value) {
            addCriterion("tax_rate =", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotEqualTo(Float value) {
            addCriterion("tax_rate <>", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateGreaterThan(Float value) {
            addCriterion("tax_rate >", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateGreaterThanOrEqualTo(Float value) {
            addCriterion("tax_rate >=", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateLessThan(Float value) {
            addCriterion("tax_rate <", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateLessThanOrEqualTo(Float value) {
            addCriterion("tax_rate <=", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateIn(List<Float> values) {
            addCriterion("tax_rate in", values, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotIn(List<Float> values) {
            addCriterion("tax_rate not in", values, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateBetween(Float value1, Float value2) {
            addCriterion("tax_rate between", value1, value2, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotBetween(Float value1, Float value2) {
            addCriterion("tax_rate not between", value1, value2, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxFeeIsNull() {
            addCriterion("tax_fee is null");
            return (Criteria) this;
        }

        public Criteria andTaxFeeIsNotNull() {
            addCriterion("tax_fee is not null");
            return (Criteria) this;
        }

        public Criteria andTaxFeeEqualTo(Integer value) {
            addCriterion("tax_fee =", value, "taxFee");
            return (Criteria) this;
        }

        public Criteria andTaxFeeNotEqualTo(Integer value) {
            addCriterion("tax_fee <>", value, "taxFee");
            return (Criteria) this;
        }

        public Criteria andTaxFeeGreaterThan(Integer value) {
            addCriterion("tax_fee >", value, "taxFee");
            return (Criteria) this;
        }

        public Criteria andTaxFeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("tax_fee >=", value, "taxFee");
            return (Criteria) this;
        }

        public Criteria andTaxFeeLessThan(Integer value) {
            addCriterion("tax_fee <", value, "taxFee");
            return (Criteria) this;
        }

        public Criteria andTaxFeeLessThanOrEqualTo(Integer value) {
            addCriterion("tax_fee <=", value, "taxFee");
            return (Criteria) this;
        }

        public Criteria andTaxFeeIn(List<Integer> values) {
            addCriterion("tax_fee in", values, "taxFee");
            return (Criteria) this;
        }

        public Criteria andTaxFeeNotIn(List<Integer> values) {
            addCriterion("tax_fee not in", values, "taxFee");
            return (Criteria) this;
        }

        public Criteria andTaxFeeBetween(Integer value1, Integer value2) {
            addCriterion("tax_fee between", value1, value2, "taxFee");
            return (Criteria) this;
        }

        public Criteria andTaxFeeNotBetween(Integer value1, Integer value2) {
            addCriterion("tax_fee not between", value1, value2, "taxFee");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Integer value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Integer value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Integer value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Integer value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Integer value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Integer> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Integer> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Integer value1, Integer value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andCapitalizedAmoutIsNull() {
            addCriterion("capitalized_amout is null");
            return (Criteria) this;
        }

        public Criteria andCapitalizedAmoutIsNotNull() {
            addCriterion("capitalized_amout is not null");
            return (Criteria) this;
        }

        public Criteria andCapitalizedAmoutEqualTo(String value) {
            addCriterion("capitalized_amout =", value, "capitalizedAmout");
            return (Criteria) this;
        }

        public Criteria andCapitalizedAmoutNotEqualTo(String value) {
            addCriterion("capitalized_amout <>", value, "capitalizedAmout");
            return (Criteria) this;
        }

        public Criteria andCapitalizedAmoutGreaterThan(String value) {
            addCriterion("capitalized_amout >", value, "capitalizedAmout");
            return (Criteria) this;
        }

        public Criteria andCapitalizedAmoutGreaterThanOrEqualTo(String value) {
            addCriterion("capitalized_amout >=", value, "capitalizedAmout");
            return (Criteria) this;
        }

        public Criteria andCapitalizedAmoutLessThan(String value) {
            addCriterion("capitalized_amout <", value, "capitalizedAmout");
            return (Criteria) this;
        }

        public Criteria andCapitalizedAmoutLessThanOrEqualTo(String value) {
            addCriterion("capitalized_amout <=", value, "capitalizedAmout");
            return (Criteria) this;
        }

        public Criteria andCapitalizedAmoutLike(String value) {
            addCriterion("capitalized_amout like", value, "capitalizedAmout");
            return (Criteria) this;
        }

        public Criteria andCapitalizedAmoutNotLike(String value) {
            addCriterion("capitalized_amout not like", value, "capitalizedAmout");
            return (Criteria) this;
        }

        public Criteria andCapitalizedAmoutIn(List<String> values) {
            addCriterion("capitalized_amout in", values, "capitalizedAmout");
            return (Criteria) this;
        }

        public Criteria andCapitalizedAmoutNotIn(List<String> values) {
            addCriterion("capitalized_amout not in", values, "capitalizedAmout");
            return (Criteria) this;
        }

        public Criteria andCapitalizedAmoutBetween(String value1, String value2) {
            addCriterion("capitalized_amout between", value1, value2, "capitalizedAmout");
            return (Criteria) this;
        }

        public Criteria andCapitalizedAmoutNotBetween(String value1, String value2) {
            addCriterion("capitalized_amout not between", value1, value2, "capitalizedAmout");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andPayeeNameIsNull() {
            addCriterion("payee_name is null");
            return (Criteria) this;
        }

        public Criteria andPayeeNameIsNotNull() {
            addCriterion("payee_name is not null");
            return (Criteria) this;
        }

        public Criteria andPayeeNameEqualTo(String value) {
            addCriterion("payee_name =", value, "payeeName");
            return (Criteria) this;
        }

        public Criteria andPayeeNameNotEqualTo(String value) {
            addCriterion("payee_name <>", value, "payeeName");
            return (Criteria) this;
        }

        public Criteria andPayeeNameGreaterThan(String value) {
            addCriterion("payee_name >", value, "payeeName");
            return (Criteria) this;
        }

        public Criteria andPayeeNameGreaterThanOrEqualTo(String value) {
            addCriterion("payee_name >=", value, "payeeName");
            return (Criteria) this;
        }

        public Criteria andPayeeNameLessThan(String value) {
            addCriterion("payee_name <", value, "payeeName");
            return (Criteria) this;
        }

        public Criteria andPayeeNameLessThanOrEqualTo(String value) {
            addCriterion("payee_name <=", value, "payeeName");
            return (Criteria) this;
        }

        public Criteria andPayeeNameLike(String value) {
            addCriterion("payee_name like", value, "payeeName");
            return (Criteria) this;
        }

        public Criteria andPayeeNameNotLike(String value) {
            addCriterion("payee_name not like", value, "payeeName");
            return (Criteria) this;
        }

        public Criteria andPayeeNameIn(List<String> values) {
            addCriterion("payee_name in", values, "payeeName");
            return (Criteria) this;
        }

        public Criteria andPayeeNameNotIn(List<String> values) {
            addCriterion("payee_name not in", values, "payeeName");
            return (Criteria) this;
        }

        public Criteria andPayeeNameBetween(String value1, String value2) {
            addCriterion("payee_name between", value1, value2, "payeeName");
            return (Criteria) this;
        }

        public Criteria andPayeeNameNotBetween(String value1, String value2) {
            addCriterion("payee_name not between", value1, value2, "payeeName");
            return (Criteria) this;
        }

        public Criteria andReviewerIsNull() {
            addCriterion("reviewer is null");
            return (Criteria) this;
        }

        public Criteria andReviewerIsNotNull() {
            addCriterion("reviewer is not null");
            return (Criteria) this;
        }

        public Criteria andReviewerEqualTo(String value) {
            addCriterion("reviewer =", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerNotEqualTo(String value) {
            addCriterion("reviewer <>", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerGreaterThan(String value) {
            addCriterion("reviewer >", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerGreaterThanOrEqualTo(String value) {
            addCriterion("reviewer >=", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerLessThan(String value) {
            addCriterion("reviewer <", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerLessThanOrEqualTo(String value) {
            addCriterion("reviewer <=", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerLike(String value) {
            addCriterion("reviewer like", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerNotLike(String value) {
            addCriterion("reviewer not like", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerIn(List<String> values) {
            addCriterion("reviewer in", values, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerNotIn(List<String> values) {
            addCriterion("reviewer not in", values, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerBetween(String value1, String value2) {
            addCriterion("reviewer between", value1, value2, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerNotBetween(String value1, String value2) {
            addCriterion("reviewer not between", value1, value2, "reviewer");
            return (Criteria) this;
        }

        public Criteria andInvoicePersonNameIsNull() {
            addCriterion("invoice_person_name is null");
            return (Criteria) this;
        }

        public Criteria andInvoicePersonNameIsNotNull() {
            addCriterion("invoice_person_name is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicePersonNameEqualTo(String value) {
            addCriterion("invoice_person_name =", value, "invoicePersonName");
            return (Criteria) this;
        }

        public Criteria andInvoicePersonNameNotEqualTo(String value) {
            addCriterion("invoice_person_name <>", value, "invoicePersonName");
            return (Criteria) this;
        }

        public Criteria andInvoicePersonNameGreaterThan(String value) {
            addCriterion("invoice_person_name >", value, "invoicePersonName");
            return (Criteria) this;
        }

        public Criteria andInvoicePersonNameGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_person_name >=", value, "invoicePersonName");
            return (Criteria) this;
        }

        public Criteria andInvoicePersonNameLessThan(String value) {
            addCriterion("invoice_person_name <", value, "invoicePersonName");
            return (Criteria) this;
        }

        public Criteria andInvoicePersonNameLessThanOrEqualTo(String value) {
            addCriterion("invoice_person_name <=", value, "invoicePersonName");
            return (Criteria) this;
        }

        public Criteria andInvoicePersonNameLike(String value) {
            addCriterion("invoice_person_name like", value, "invoicePersonName");
            return (Criteria) this;
        }

        public Criteria andInvoicePersonNameNotLike(String value) {
            addCriterion("invoice_person_name not like", value, "invoicePersonName");
            return (Criteria) this;
        }

        public Criteria andInvoicePersonNameIn(List<String> values) {
            addCriterion("invoice_person_name in", values, "invoicePersonName");
            return (Criteria) this;
        }

        public Criteria andInvoicePersonNameNotIn(List<String> values) {
            addCriterion("invoice_person_name not in", values, "invoicePersonName");
            return (Criteria) this;
        }

        public Criteria andInvoicePersonNameBetween(String value1, String value2) {
            addCriterion("invoice_person_name between", value1, value2, "invoicePersonName");
            return (Criteria) this;
        }

        public Criteria andInvoicePersonNameNotBetween(String value1, String value2) {
            addCriterion("invoice_person_name not between", value1, value2, "invoicePersonName");
            return (Criteria) this;
        }

        public Criteria andBillingPartyNameIsNull() {
            addCriterion("billing_party_name is null");
            return (Criteria) this;
        }

        public Criteria andBillingPartyNameIsNotNull() {
            addCriterion("billing_party_name is not null");
            return (Criteria) this;
        }

        public Criteria andBillingPartyNameEqualTo(String value) {
            addCriterion("billing_party_name =", value, "billingPartyName");
            return (Criteria) this;
        }

        public Criteria andBillingPartyNameNotEqualTo(String value) {
            addCriterion("billing_party_name <>", value, "billingPartyName");
            return (Criteria) this;
        }

        public Criteria andBillingPartyNameGreaterThan(String value) {
            addCriterion("billing_party_name >", value, "billingPartyName");
            return (Criteria) this;
        }

        public Criteria andBillingPartyNameGreaterThanOrEqualTo(String value) {
            addCriterion("billing_party_name >=", value, "billingPartyName");
            return (Criteria) this;
        }

        public Criteria andBillingPartyNameLessThan(String value) {
            addCriterion("billing_party_name <", value, "billingPartyName");
            return (Criteria) this;
        }

        public Criteria andBillingPartyNameLessThanOrEqualTo(String value) {
            addCriterion("billing_party_name <=", value, "billingPartyName");
            return (Criteria) this;
        }

        public Criteria andBillingPartyNameLike(String value) {
            addCriterion("billing_party_name like", value, "billingPartyName");
            return (Criteria) this;
        }

        public Criteria andBillingPartyNameNotLike(String value) {
            addCriterion("billing_party_name not like", value, "billingPartyName");
            return (Criteria) this;
        }

        public Criteria andBillingPartyNameIn(List<String> values) {
            addCriterion("billing_party_name in", values, "billingPartyName");
            return (Criteria) this;
        }

        public Criteria andBillingPartyNameNotIn(List<String> values) {
            addCriterion("billing_party_name not in", values, "billingPartyName");
            return (Criteria) this;
        }

        public Criteria andBillingPartyNameBetween(String value1, String value2) {
            addCriterion("billing_party_name between", value1, value2, "billingPartyName");
            return (Criteria) this;
        }

        public Criteria andBillingPartyNameNotBetween(String value1, String value2) {
            addCriterion("billing_party_name not between", value1, value2, "billingPartyName");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdentifyNumberIsNull() {
            addCriterion("taxpayer_identify_number is null");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdentifyNumberIsNotNull() {
            addCriterion("taxpayer_identify_number is not null");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdentifyNumberEqualTo(String value) {
            addCriterion("taxpayer_identify_number =", value, "taxpayerIdentifyNumber");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdentifyNumberNotEqualTo(String value) {
            addCriterion("taxpayer_identify_number <>", value, "taxpayerIdentifyNumber");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdentifyNumberGreaterThan(String value) {
            addCriterion("taxpayer_identify_number >", value, "taxpayerIdentifyNumber");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdentifyNumberGreaterThanOrEqualTo(String value) {
            addCriterion("taxpayer_identify_number >=", value, "taxpayerIdentifyNumber");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdentifyNumberLessThan(String value) {
            addCriterion("taxpayer_identify_number <", value, "taxpayerIdentifyNumber");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdentifyNumberLessThanOrEqualTo(String value) {
            addCriterion("taxpayer_identify_number <=", value, "taxpayerIdentifyNumber");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdentifyNumberLike(String value) {
            addCriterion("taxpayer_identify_number like", value, "taxpayerIdentifyNumber");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdentifyNumberNotLike(String value) {
            addCriterion("taxpayer_identify_number not like", value, "taxpayerIdentifyNumber");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdentifyNumberIn(List<String> values) {
            addCriterion("taxpayer_identify_number in", values, "taxpayerIdentifyNumber");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdentifyNumberNotIn(List<String> values) {
            addCriterion("taxpayer_identify_number not in", values, "taxpayerIdentifyNumber");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdentifyNumberBetween(String value1, String value2) {
            addCriterion("taxpayer_identify_number between", value1, value2, "taxpayerIdentifyNumber");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdentifyNumberNotBetween(String value1, String value2) {
            addCriterion("taxpayer_identify_number not between", value1, value2, "taxpayerIdentifyNumber");
            return (Criteria) this;
        }

        public Criteria andBillingPartyAddressAndTelephoneIsNull() {
            addCriterion("billing_party_address_and_telephone is null");
            return (Criteria) this;
        }

        public Criteria andBillingPartyAddressAndTelephoneIsNotNull() {
            addCriterion("billing_party_address_and_telephone is not null");
            return (Criteria) this;
        }

        public Criteria andBillingPartyAddressAndTelephoneEqualTo(String value) {
            addCriterion("billing_party_address_and_telephone =", value, "billingPartyAddressAndTelephone");
            return (Criteria) this;
        }

        public Criteria andBillingPartyAddressAndTelephoneNotEqualTo(String value) {
            addCriterion("billing_party_address_and_telephone <>", value, "billingPartyAddressAndTelephone");
            return (Criteria) this;
        }

        public Criteria andBillingPartyAddressAndTelephoneGreaterThan(String value) {
            addCriterion("billing_party_address_and_telephone >", value, "billingPartyAddressAndTelephone");
            return (Criteria) this;
        }

        public Criteria andBillingPartyAddressAndTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("billing_party_address_and_telephone >=", value, "billingPartyAddressAndTelephone");
            return (Criteria) this;
        }

        public Criteria andBillingPartyAddressAndTelephoneLessThan(String value) {
            addCriterion("billing_party_address_and_telephone <", value, "billingPartyAddressAndTelephone");
            return (Criteria) this;
        }

        public Criteria andBillingPartyAddressAndTelephoneLessThanOrEqualTo(String value) {
            addCriterion("billing_party_address_and_telephone <=", value, "billingPartyAddressAndTelephone");
            return (Criteria) this;
        }

        public Criteria andBillingPartyAddressAndTelephoneLike(String value) {
            addCriterion("billing_party_address_and_telephone like", value, "billingPartyAddressAndTelephone");
            return (Criteria) this;
        }

        public Criteria andBillingPartyAddressAndTelephoneNotLike(String value) {
            addCriterion("billing_party_address_and_telephone not like", value, "billingPartyAddressAndTelephone");
            return (Criteria) this;
        }

        public Criteria andBillingPartyAddressAndTelephoneIn(List<String> values) {
            addCriterion("billing_party_address_and_telephone in", values, "billingPartyAddressAndTelephone");
            return (Criteria) this;
        }

        public Criteria andBillingPartyAddressAndTelephoneNotIn(List<String> values) {
            addCriterion("billing_party_address_and_telephone not in", values, "billingPartyAddressAndTelephone");
            return (Criteria) this;
        }

        public Criteria andBillingPartyAddressAndTelephoneBetween(String value1, String value2) {
            addCriterion("billing_party_address_and_telephone between", value1, value2, "billingPartyAddressAndTelephone");
            return (Criteria) this;
        }

        public Criteria andBillingPartyAddressAndTelephoneNotBetween(String value1, String value2) {
            addCriterion("billing_party_address_and_telephone not between", value1, value2, "billingPartyAddressAndTelephone");
            return (Criteria) this;
        }

        public Criteria andAccountBankAndPhoneNumberIsNull() {
            addCriterion("account_bank_and_phone_number is null");
            return (Criteria) this;
        }

        public Criteria andAccountBankAndPhoneNumberIsNotNull() {
            addCriterion("account_bank_and_phone_number is not null");
            return (Criteria) this;
        }

        public Criteria andAccountBankAndPhoneNumberEqualTo(String value) {
            addCriterion("account_bank_and_phone_number =", value, "accountBankAndPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andAccountBankAndPhoneNumberNotEqualTo(String value) {
            addCriterion("account_bank_and_phone_number <>", value, "accountBankAndPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andAccountBankAndPhoneNumberGreaterThan(String value) {
            addCriterion("account_bank_and_phone_number >", value, "accountBankAndPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andAccountBankAndPhoneNumberGreaterThanOrEqualTo(String value) {
            addCriterion("account_bank_and_phone_number >=", value, "accountBankAndPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andAccountBankAndPhoneNumberLessThan(String value) {
            addCriterion("account_bank_and_phone_number <", value, "accountBankAndPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andAccountBankAndPhoneNumberLessThanOrEqualTo(String value) {
            addCriterion("account_bank_and_phone_number <=", value, "accountBankAndPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andAccountBankAndPhoneNumberLike(String value) {
            addCriterion("account_bank_and_phone_number like", value, "accountBankAndPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andAccountBankAndPhoneNumberNotLike(String value) {
            addCriterion("account_bank_and_phone_number not like", value, "accountBankAndPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andAccountBankAndPhoneNumberIn(List<String> values) {
            addCriterion("account_bank_and_phone_number in", values, "accountBankAndPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andAccountBankAndPhoneNumberNotIn(List<String> values) {
            addCriterion("account_bank_and_phone_number not in", values, "accountBankAndPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andAccountBankAndPhoneNumberBetween(String value1, String value2) {
            addCriterion("account_bank_and_phone_number between", value1, value2, "accountBankAndPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andAccountBankAndPhoneNumberNotBetween(String value1, String value2) {
            addCriterion("account_bank_and_phone_number not between", value1, value2, "accountBankAndPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}