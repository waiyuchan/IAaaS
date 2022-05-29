package com.gbtech.iaaas.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AcContractExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AcContractExample() {
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

        public Criteria andCUnicodeIsNull() {
            addCriterion("c_unicode is null");
            return (Criteria) this;
        }

        public Criteria andCUnicodeIsNotNull() {
            addCriterion("c_unicode is not null");
            return (Criteria) this;
        }

        public Criteria andCUnicodeEqualTo(String value) {
            addCriterion("c_unicode =", value, "cUnicode");
            return (Criteria) this;
        }

        public Criteria andCUnicodeNotEqualTo(String value) {
            addCriterion("c_unicode <>", value, "cUnicode");
            return (Criteria) this;
        }

        public Criteria andCUnicodeGreaterThan(String value) {
            addCriterion("c_unicode >", value, "cUnicode");
            return (Criteria) this;
        }

        public Criteria andCUnicodeGreaterThanOrEqualTo(String value) {
            addCriterion("c_unicode >=", value, "cUnicode");
            return (Criteria) this;
        }

        public Criteria andCUnicodeLessThan(String value) {
            addCriterion("c_unicode <", value, "cUnicode");
            return (Criteria) this;
        }

        public Criteria andCUnicodeLessThanOrEqualTo(String value) {
            addCriterion("c_unicode <=", value, "cUnicode");
            return (Criteria) this;
        }

        public Criteria andCUnicodeLike(String value) {
            addCriterion("c_unicode like", value, "cUnicode");
            return (Criteria) this;
        }

        public Criteria andCUnicodeNotLike(String value) {
            addCriterion("c_unicode not like", value, "cUnicode");
            return (Criteria) this;
        }

        public Criteria andCUnicodeIn(List<String> values) {
            addCriterion("c_unicode in", values, "cUnicode");
            return (Criteria) this;
        }

        public Criteria andCUnicodeNotIn(List<String> values) {
            addCriterion("c_unicode not in", values, "cUnicode");
            return (Criteria) this;
        }

        public Criteria andCUnicodeBetween(String value1, String value2) {
            addCriterion("c_unicode between", value1, value2, "cUnicode");
            return (Criteria) this;
        }

        public Criteria andCUnicodeNotBetween(String value1, String value2) {
            addCriterion("c_unicode not between", value1, value2, "cUnicode");
            return (Criteria) this;
        }

        public Criteria andRoomIdIsNull() {
            addCriterion("room_id is null");
            return (Criteria) this;
        }

        public Criteria andRoomIdIsNotNull() {
            addCriterion("room_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoomIdEqualTo(Integer value) {
            addCriterion("room_id =", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotEqualTo(Integer value) {
            addCriterion("room_id <>", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdGreaterThan(Integer value) {
            addCriterion("room_id >", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("room_id >=", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdLessThan(Integer value) {
            addCriterion("room_id <", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdLessThanOrEqualTo(Integer value) {
            addCriterion("room_id <=", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdIn(List<Integer> values) {
            addCriterion("room_id in", values, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotIn(List<Integer> values) {
            addCriterion("room_id not in", values, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdBetween(Integer value1, Integer value2) {
            addCriterion("room_id between", value1, value2, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotBetween(Integer value1, Integer value2) {
            addCriterion("room_id not between", value1, value2, "roomId");
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

        public Criteria andFeeStatusIsNull() {
            addCriterion("fee_status is null");
            return (Criteria) this;
        }

        public Criteria andFeeStatusIsNotNull() {
            addCriterion("fee_status is not null");
            return (Criteria) this;
        }

        public Criteria andFeeStatusEqualTo(Byte value) {
            addCriterion("fee_status =", value, "feeStatus");
            return (Criteria) this;
        }

        public Criteria andFeeStatusNotEqualTo(Byte value) {
            addCriterion("fee_status <>", value, "feeStatus");
            return (Criteria) this;
        }

        public Criteria andFeeStatusGreaterThan(Byte value) {
            addCriterion("fee_status >", value, "feeStatus");
            return (Criteria) this;
        }

        public Criteria andFeeStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("fee_status >=", value, "feeStatus");
            return (Criteria) this;
        }

        public Criteria andFeeStatusLessThan(Byte value) {
            addCriterion("fee_status <", value, "feeStatus");
            return (Criteria) this;
        }

        public Criteria andFeeStatusLessThanOrEqualTo(Byte value) {
            addCriterion("fee_status <=", value, "feeStatus");
            return (Criteria) this;
        }

        public Criteria andFeeStatusIn(List<Byte> values) {
            addCriterion("fee_status in", values, "feeStatus");
            return (Criteria) this;
        }

        public Criteria andFeeStatusNotIn(List<Byte> values) {
            addCriterion("fee_status not in", values, "feeStatus");
            return (Criteria) this;
        }

        public Criteria andFeeStatusBetween(Byte value1, Byte value2) {
            addCriterion("fee_status between", value1, value2, "feeStatus");
            return (Criteria) this;
        }

        public Criteria andFeeStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("fee_status not between", value1, value2, "feeStatus");
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

        public Criteria andIsTransferIsNull() {
            addCriterion("is_transfer is null");
            return (Criteria) this;
        }

        public Criteria andIsTransferIsNotNull() {
            addCriterion("is_transfer is not null");
            return (Criteria) this;
        }

        public Criteria andIsTransferEqualTo(Byte value) {
            addCriterion("is_transfer =", value, "isTransfer");
            return (Criteria) this;
        }

        public Criteria andIsTransferNotEqualTo(Byte value) {
            addCriterion("is_transfer <>", value, "isTransfer");
            return (Criteria) this;
        }

        public Criteria andIsTransferGreaterThan(Byte value) {
            addCriterion("is_transfer >", value, "isTransfer");
            return (Criteria) this;
        }

        public Criteria andIsTransferGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_transfer >=", value, "isTransfer");
            return (Criteria) this;
        }

        public Criteria andIsTransferLessThan(Byte value) {
            addCriterion("is_transfer <", value, "isTransfer");
            return (Criteria) this;
        }

        public Criteria andIsTransferLessThanOrEqualTo(Byte value) {
            addCriterion("is_transfer <=", value, "isTransfer");
            return (Criteria) this;
        }

        public Criteria andIsTransferIn(List<Byte> values) {
            addCriterion("is_transfer in", values, "isTransfer");
            return (Criteria) this;
        }

        public Criteria andIsTransferNotIn(List<Byte> values) {
            addCriterion("is_transfer not in", values, "isTransfer");
            return (Criteria) this;
        }

        public Criteria andIsTransferBetween(Byte value1, Byte value2) {
            addCriterion("is_transfer between", value1, value2, "isTransfer");
            return (Criteria) this;
        }

        public Criteria andIsTransferNotBetween(Byte value1, Byte value2) {
            addCriterion("is_transfer not between", value1, value2, "isTransfer");
            return (Criteria) this;
        }

        public Criteria andPreTenantIsNull() {
            addCriterion("pre_tenant is null");
            return (Criteria) this;
        }

        public Criteria andPreTenantIsNotNull() {
            addCriterion("pre_tenant is not null");
            return (Criteria) this;
        }

        public Criteria andPreTenantEqualTo(String value) {
            addCriterion("pre_tenant =", value, "preTenant");
            return (Criteria) this;
        }

        public Criteria andPreTenantNotEqualTo(String value) {
            addCriterion("pre_tenant <>", value, "preTenant");
            return (Criteria) this;
        }

        public Criteria andPreTenantGreaterThan(String value) {
            addCriterion("pre_tenant >", value, "preTenant");
            return (Criteria) this;
        }

        public Criteria andPreTenantGreaterThanOrEqualTo(String value) {
            addCriterion("pre_tenant >=", value, "preTenant");
            return (Criteria) this;
        }

        public Criteria andPreTenantLessThan(String value) {
            addCriterion("pre_tenant <", value, "preTenant");
            return (Criteria) this;
        }

        public Criteria andPreTenantLessThanOrEqualTo(String value) {
            addCriterion("pre_tenant <=", value, "preTenant");
            return (Criteria) this;
        }

        public Criteria andPreTenantLike(String value) {
            addCriterion("pre_tenant like", value, "preTenant");
            return (Criteria) this;
        }

        public Criteria andPreTenantNotLike(String value) {
            addCriterion("pre_tenant not like", value, "preTenant");
            return (Criteria) this;
        }

        public Criteria andPreTenantIn(List<String> values) {
            addCriterion("pre_tenant in", values, "preTenant");
            return (Criteria) this;
        }

        public Criteria andPreTenantNotIn(List<String> values) {
            addCriterion("pre_tenant not in", values, "preTenant");
            return (Criteria) this;
        }

        public Criteria andPreTenantBetween(String value1, String value2) {
            addCriterion("pre_tenant between", value1, value2, "preTenant");
            return (Criteria) this;
        }

        public Criteria andPreTenantNotBetween(String value1, String value2) {
            addCriterion("pre_tenant not between", value1, value2, "preTenant");
            return (Criteria) this;
        }

        public Criteria andIsRenewIsNull() {
            addCriterion("is_renew is null");
            return (Criteria) this;
        }

        public Criteria andIsRenewIsNotNull() {
            addCriterion("is_renew is not null");
            return (Criteria) this;
        }

        public Criteria andIsRenewEqualTo(Byte value) {
            addCriterion("is_renew =", value, "isRenew");
            return (Criteria) this;
        }

        public Criteria andIsRenewNotEqualTo(Byte value) {
            addCriterion("is_renew <>", value, "isRenew");
            return (Criteria) this;
        }

        public Criteria andIsRenewGreaterThan(Byte value) {
            addCriterion("is_renew >", value, "isRenew");
            return (Criteria) this;
        }

        public Criteria andIsRenewGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_renew >=", value, "isRenew");
            return (Criteria) this;
        }

        public Criteria andIsRenewLessThan(Byte value) {
            addCriterion("is_renew <", value, "isRenew");
            return (Criteria) this;
        }

        public Criteria andIsRenewLessThanOrEqualTo(Byte value) {
            addCriterion("is_renew <=", value, "isRenew");
            return (Criteria) this;
        }

        public Criteria andIsRenewIn(List<Byte> values) {
            addCriterion("is_renew in", values, "isRenew");
            return (Criteria) this;
        }

        public Criteria andIsRenewNotIn(List<Byte> values) {
            addCriterion("is_renew not in", values, "isRenew");
            return (Criteria) this;
        }

        public Criteria andIsRenewBetween(Byte value1, Byte value2) {
            addCriterion("is_renew between", value1, value2, "isRenew");
            return (Criteria) this;
        }

        public Criteria andIsRenewNotBetween(Byte value1, Byte value2) {
            addCriterion("is_renew not between", value1, value2, "isRenew");
            return (Criteria) this;
        }

        public Criteria andPreContractIdIsNull() {
            addCriterion("pre_contract_id is null");
            return (Criteria) this;
        }

        public Criteria andPreContractIdIsNotNull() {
            addCriterion("pre_contract_id is not null");
            return (Criteria) this;
        }

        public Criteria andPreContractIdEqualTo(Integer value) {
            addCriterion("pre_contract_id =", value, "preContractId");
            return (Criteria) this;
        }

        public Criteria andPreContractIdNotEqualTo(Integer value) {
            addCriterion("pre_contract_id <>", value, "preContractId");
            return (Criteria) this;
        }

        public Criteria andPreContractIdGreaterThan(Integer value) {
            addCriterion("pre_contract_id >", value, "preContractId");
            return (Criteria) this;
        }

        public Criteria andPreContractIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pre_contract_id >=", value, "preContractId");
            return (Criteria) this;
        }

        public Criteria andPreContractIdLessThan(Integer value) {
            addCriterion("pre_contract_id <", value, "preContractId");
            return (Criteria) this;
        }

        public Criteria andPreContractIdLessThanOrEqualTo(Integer value) {
            addCriterion("pre_contract_id <=", value, "preContractId");
            return (Criteria) this;
        }

        public Criteria andPreContractIdIn(List<Integer> values) {
            addCriterion("pre_contract_id in", values, "preContractId");
            return (Criteria) this;
        }

        public Criteria andPreContractIdNotIn(List<Integer> values) {
            addCriterion("pre_contract_id not in", values, "preContractId");
            return (Criteria) this;
        }

        public Criteria andPreContractIdBetween(Integer value1, Integer value2) {
            addCriterion("pre_contract_id between", value1, value2, "preContractId");
            return (Criteria) this;
        }

        public Criteria andPreContractIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pre_contract_id not between", value1, value2, "preContractId");
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

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
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

        public Criteria andModifyTimeIsNull() {
            addCriterion("modify_time is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("modify_time =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("modify_time <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("modify_time >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_time >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("modify_time <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("modify_time <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("modify_time in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("modify_time not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("modify_time between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("modify_time not between", value1, value2, "modifyTime");
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