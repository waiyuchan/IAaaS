package com.gbtech.iaaas.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AcExpressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AcExpressExample() {
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

        public Criteria andTrackNumberIsNull() {
            addCriterion("track_number is null");
            return (Criteria) this;
        }

        public Criteria andTrackNumberIsNotNull() {
            addCriterion("track_number is not null");
            return (Criteria) this;
        }

        public Criteria andTrackNumberEqualTo(String value) {
            addCriterion("track_number =", value, "trackNumber");
            return (Criteria) this;
        }

        public Criteria andTrackNumberNotEqualTo(String value) {
            addCriterion("track_number <>", value, "trackNumber");
            return (Criteria) this;
        }

        public Criteria andTrackNumberGreaterThan(String value) {
            addCriterion("track_number >", value, "trackNumber");
            return (Criteria) this;
        }

        public Criteria andTrackNumberGreaterThanOrEqualTo(String value) {
            addCriterion("track_number >=", value, "trackNumber");
            return (Criteria) this;
        }

        public Criteria andTrackNumberLessThan(String value) {
            addCriterion("track_number <", value, "trackNumber");
            return (Criteria) this;
        }

        public Criteria andTrackNumberLessThanOrEqualTo(String value) {
            addCriterion("track_number <=", value, "trackNumber");
            return (Criteria) this;
        }

        public Criteria andTrackNumberLike(String value) {
            addCriterion("track_number like", value, "trackNumber");
            return (Criteria) this;
        }

        public Criteria andTrackNumberNotLike(String value) {
            addCriterion("track_number not like", value, "trackNumber");
            return (Criteria) this;
        }

        public Criteria andTrackNumberIn(List<String> values) {
            addCriterion("track_number in", values, "trackNumber");
            return (Criteria) this;
        }

        public Criteria andTrackNumberNotIn(List<String> values) {
            addCriterion("track_number not in", values, "trackNumber");
            return (Criteria) this;
        }

        public Criteria andTrackNumberBetween(String value1, String value2) {
            addCriterion("track_number between", value1, value2, "trackNumber");
            return (Criteria) this;
        }

        public Criteria andTrackNumberNotBetween(String value1, String value2) {
            addCriterion("track_number not between", value1, value2, "trackNumber");
            return (Criteria) this;
        }

        public Criteria andExpressCompanyIsNull() {
            addCriterion("express_company is null");
            return (Criteria) this;
        }

        public Criteria andExpressCompanyIsNotNull() {
            addCriterion("express_company is not null");
            return (Criteria) this;
        }

        public Criteria andExpressCompanyEqualTo(String value) {
            addCriterion("express_company =", value, "expressCompany");
            return (Criteria) this;
        }

        public Criteria andExpressCompanyNotEqualTo(String value) {
            addCriterion("express_company <>", value, "expressCompany");
            return (Criteria) this;
        }

        public Criteria andExpressCompanyGreaterThan(String value) {
            addCriterion("express_company >", value, "expressCompany");
            return (Criteria) this;
        }

        public Criteria andExpressCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("express_company >=", value, "expressCompany");
            return (Criteria) this;
        }

        public Criteria andExpressCompanyLessThan(String value) {
            addCriterion("express_company <", value, "expressCompany");
            return (Criteria) this;
        }

        public Criteria andExpressCompanyLessThanOrEqualTo(String value) {
            addCriterion("express_company <=", value, "expressCompany");
            return (Criteria) this;
        }

        public Criteria andExpressCompanyLike(String value) {
            addCriterion("express_company like", value, "expressCompany");
            return (Criteria) this;
        }

        public Criteria andExpressCompanyNotLike(String value) {
            addCriterion("express_company not like", value, "expressCompany");
            return (Criteria) this;
        }

        public Criteria andExpressCompanyIn(List<String> values) {
            addCriterion("express_company in", values, "expressCompany");
            return (Criteria) this;
        }

        public Criteria andExpressCompanyNotIn(List<String> values) {
            addCriterion("express_company not in", values, "expressCompany");
            return (Criteria) this;
        }

        public Criteria andExpressCompanyBetween(String value1, String value2) {
            addCriterion("express_company between", value1, value2, "expressCompany");
            return (Criteria) this;
        }

        public Criteria andExpressCompanyNotBetween(String value1, String value2) {
            addCriterion("express_company not between", value1, value2, "expressCompany");
            return (Criteria) this;
        }

        public Criteria andSenderIsNull() {
            addCriterion("sender is null");
            return (Criteria) this;
        }

        public Criteria andSenderIsNotNull() {
            addCriterion("sender is not null");
            return (Criteria) this;
        }

        public Criteria andSenderEqualTo(String value) {
            addCriterion("sender =", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderNotEqualTo(String value) {
            addCriterion("sender <>", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderGreaterThan(String value) {
            addCriterion("sender >", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderGreaterThanOrEqualTo(String value) {
            addCriterion("sender >=", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderLessThan(String value) {
            addCriterion("sender <", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderLessThanOrEqualTo(String value) {
            addCriterion("sender <=", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderLike(String value) {
            addCriterion("sender like", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderNotLike(String value) {
            addCriterion("sender not like", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderIn(List<String> values) {
            addCriterion("sender in", values, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderNotIn(List<String> values) {
            addCriterion("sender not in", values, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderBetween(String value1, String value2) {
            addCriterion("sender between", value1, value2, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderNotBetween(String value1, String value2) {
            addCriterion("sender not between", value1, value2, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderAddressIsNull() {
            addCriterion("sender_address is null");
            return (Criteria) this;
        }

        public Criteria andSenderAddressIsNotNull() {
            addCriterion("sender_address is not null");
            return (Criteria) this;
        }

        public Criteria andSenderAddressEqualTo(String value) {
            addCriterion("sender_address =", value, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressNotEqualTo(String value) {
            addCriterion("sender_address <>", value, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressGreaterThan(String value) {
            addCriterion("sender_address >", value, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressGreaterThanOrEqualTo(String value) {
            addCriterion("sender_address >=", value, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressLessThan(String value) {
            addCriterion("sender_address <", value, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressLessThanOrEqualTo(String value) {
            addCriterion("sender_address <=", value, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressLike(String value) {
            addCriterion("sender_address like", value, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressNotLike(String value) {
            addCriterion("sender_address not like", value, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressIn(List<String> values) {
            addCriterion("sender_address in", values, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressNotIn(List<String> values) {
            addCriterion("sender_address not in", values, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressBetween(String value1, String value2) {
            addCriterion("sender_address between", value1, value2, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressNotBetween(String value1, String value2) {
            addCriterion("sender_address not between", value1, value2, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderMobilePhoneIsNull() {
            addCriterion("sender_mobile_phone is null");
            return (Criteria) this;
        }

        public Criteria andSenderMobilePhoneIsNotNull() {
            addCriterion("sender_mobile_phone is not null");
            return (Criteria) this;
        }

        public Criteria andSenderMobilePhoneEqualTo(String value) {
            addCriterion("sender_mobile_phone =", value, "senderMobilePhone");
            return (Criteria) this;
        }

        public Criteria andSenderMobilePhoneNotEqualTo(String value) {
            addCriterion("sender_mobile_phone <>", value, "senderMobilePhone");
            return (Criteria) this;
        }

        public Criteria andSenderMobilePhoneGreaterThan(String value) {
            addCriterion("sender_mobile_phone >", value, "senderMobilePhone");
            return (Criteria) this;
        }

        public Criteria andSenderMobilePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("sender_mobile_phone >=", value, "senderMobilePhone");
            return (Criteria) this;
        }

        public Criteria andSenderMobilePhoneLessThan(String value) {
            addCriterion("sender_mobile_phone <", value, "senderMobilePhone");
            return (Criteria) this;
        }

        public Criteria andSenderMobilePhoneLessThanOrEqualTo(String value) {
            addCriterion("sender_mobile_phone <=", value, "senderMobilePhone");
            return (Criteria) this;
        }

        public Criteria andSenderMobilePhoneLike(String value) {
            addCriterion("sender_mobile_phone like", value, "senderMobilePhone");
            return (Criteria) this;
        }

        public Criteria andSenderMobilePhoneNotLike(String value) {
            addCriterion("sender_mobile_phone not like", value, "senderMobilePhone");
            return (Criteria) this;
        }

        public Criteria andSenderMobilePhoneIn(List<String> values) {
            addCriterion("sender_mobile_phone in", values, "senderMobilePhone");
            return (Criteria) this;
        }

        public Criteria andSenderMobilePhoneNotIn(List<String> values) {
            addCriterion("sender_mobile_phone not in", values, "senderMobilePhone");
            return (Criteria) this;
        }

        public Criteria andSenderMobilePhoneBetween(String value1, String value2) {
            addCriterion("sender_mobile_phone between", value1, value2, "senderMobilePhone");
            return (Criteria) this;
        }

        public Criteria andSenderMobilePhoneNotBetween(String value1, String value2) {
            addCriterion("sender_mobile_phone not between", value1, value2, "senderMobilePhone");
            return (Criteria) this;
        }

        public Criteria andSenderMailIsNull() {
            addCriterion("sender_mail is null");
            return (Criteria) this;
        }

        public Criteria andSenderMailIsNotNull() {
            addCriterion("sender_mail is not null");
            return (Criteria) this;
        }

        public Criteria andSenderMailEqualTo(String value) {
            addCriterion("sender_mail =", value, "senderMail");
            return (Criteria) this;
        }

        public Criteria andSenderMailNotEqualTo(String value) {
            addCriterion("sender_mail <>", value, "senderMail");
            return (Criteria) this;
        }

        public Criteria andSenderMailGreaterThan(String value) {
            addCriterion("sender_mail >", value, "senderMail");
            return (Criteria) this;
        }

        public Criteria andSenderMailGreaterThanOrEqualTo(String value) {
            addCriterion("sender_mail >=", value, "senderMail");
            return (Criteria) this;
        }

        public Criteria andSenderMailLessThan(String value) {
            addCriterion("sender_mail <", value, "senderMail");
            return (Criteria) this;
        }

        public Criteria andSenderMailLessThanOrEqualTo(String value) {
            addCriterion("sender_mail <=", value, "senderMail");
            return (Criteria) this;
        }

        public Criteria andSenderMailLike(String value) {
            addCriterion("sender_mail like", value, "senderMail");
            return (Criteria) this;
        }

        public Criteria andSenderMailNotLike(String value) {
            addCriterion("sender_mail not like", value, "senderMail");
            return (Criteria) this;
        }

        public Criteria andSenderMailIn(List<String> values) {
            addCriterion("sender_mail in", values, "senderMail");
            return (Criteria) this;
        }

        public Criteria andSenderMailNotIn(List<String> values) {
            addCriterion("sender_mail not in", values, "senderMail");
            return (Criteria) this;
        }

        public Criteria andSenderMailBetween(String value1, String value2) {
            addCriterion("sender_mail between", value1, value2, "senderMail");
            return (Criteria) this;
        }

        public Criteria andSenderMailNotBetween(String value1, String value2) {
            addCriterion("sender_mail not between", value1, value2, "senderMail");
            return (Criteria) this;
        }

        public Criteria andRecipientIsNull() {
            addCriterion("recipient is null");
            return (Criteria) this;
        }

        public Criteria andRecipientIsNotNull() {
            addCriterion("recipient is not null");
            return (Criteria) this;
        }

        public Criteria andRecipientEqualTo(String value) {
            addCriterion("recipient =", value, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientNotEqualTo(String value) {
            addCriterion("recipient <>", value, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientGreaterThan(String value) {
            addCriterion("recipient >", value, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientGreaterThanOrEqualTo(String value) {
            addCriterion("recipient >=", value, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientLessThan(String value) {
            addCriterion("recipient <", value, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientLessThanOrEqualTo(String value) {
            addCriterion("recipient <=", value, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientLike(String value) {
            addCriterion("recipient like", value, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientNotLike(String value) {
            addCriterion("recipient not like", value, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientIn(List<String> values) {
            addCriterion("recipient in", values, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientNotIn(List<String> values) {
            addCriterion("recipient not in", values, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientBetween(String value1, String value2) {
            addCriterion("recipient between", value1, value2, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientNotBetween(String value1, String value2) {
            addCriterion("recipient not between", value1, value2, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientAddressIsNull() {
            addCriterion("recipient_address is null");
            return (Criteria) this;
        }

        public Criteria andRecipientAddressIsNotNull() {
            addCriterion("recipient_address is not null");
            return (Criteria) this;
        }

        public Criteria andRecipientAddressEqualTo(String value) {
            addCriterion("recipient_address =", value, "recipientAddress");
            return (Criteria) this;
        }

        public Criteria andRecipientAddressNotEqualTo(String value) {
            addCriterion("recipient_address <>", value, "recipientAddress");
            return (Criteria) this;
        }

        public Criteria andRecipientAddressGreaterThan(String value) {
            addCriterion("recipient_address >", value, "recipientAddress");
            return (Criteria) this;
        }

        public Criteria andRecipientAddressGreaterThanOrEqualTo(String value) {
            addCriterion("recipient_address >=", value, "recipientAddress");
            return (Criteria) this;
        }

        public Criteria andRecipientAddressLessThan(String value) {
            addCriterion("recipient_address <", value, "recipientAddress");
            return (Criteria) this;
        }

        public Criteria andRecipientAddressLessThanOrEqualTo(String value) {
            addCriterion("recipient_address <=", value, "recipientAddress");
            return (Criteria) this;
        }

        public Criteria andRecipientAddressLike(String value) {
            addCriterion("recipient_address like", value, "recipientAddress");
            return (Criteria) this;
        }

        public Criteria andRecipientAddressNotLike(String value) {
            addCriterion("recipient_address not like", value, "recipientAddress");
            return (Criteria) this;
        }

        public Criteria andRecipientAddressIn(List<String> values) {
            addCriterion("recipient_address in", values, "recipientAddress");
            return (Criteria) this;
        }

        public Criteria andRecipientAddressNotIn(List<String> values) {
            addCriterion("recipient_address not in", values, "recipientAddress");
            return (Criteria) this;
        }

        public Criteria andRecipientAddressBetween(String value1, String value2) {
            addCriterion("recipient_address between", value1, value2, "recipientAddress");
            return (Criteria) this;
        }

        public Criteria andRecipientAddressNotBetween(String value1, String value2) {
            addCriterion("recipient_address not between", value1, value2, "recipientAddress");
            return (Criteria) this;
        }

        public Criteria andRecipientMobilePhoneIsNull() {
            addCriterion("recipient_mobile_phone is null");
            return (Criteria) this;
        }

        public Criteria andRecipientMobilePhoneIsNotNull() {
            addCriterion("recipient_mobile_phone is not null");
            return (Criteria) this;
        }

        public Criteria andRecipientMobilePhoneEqualTo(String value) {
            addCriterion("recipient_mobile_phone =", value, "recipientMobilePhone");
            return (Criteria) this;
        }

        public Criteria andRecipientMobilePhoneNotEqualTo(String value) {
            addCriterion("recipient_mobile_phone <>", value, "recipientMobilePhone");
            return (Criteria) this;
        }

        public Criteria andRecipientMobilePhoneGreaterThan(String value) {
            addCriterion("recipient_mobile_phone >", value, "recipientMobilePhone");
            return (Criteria) this;
        }

        public Criteria andRecipientMobilePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("recipient_mobile_phone >=", value, "recipientMobilePhone");
            return (Criteria) this;
        }

        public Criteria andRecipientMobilePhoneLessThan(String value) {
            addCriterion("recipient_mobile_phone <", value, "recipientMobilePhone");
            return (Criteria) this;
        }

        public Criteria andRecipientMobilePhoneLessThanOrEqualTo(String value) {
            addCriterion("recipient_mobile_phone <=", value, "recipientMobilePhone");
            return (Criteria) this;
        }

        public Criteria andRecipientMobilePhoneLike(String value) {
            addCriterion("recipient_mobile_phone like", value, "recipientMobilePhone");
            return (Criteria) this;
        }

        public Criteria andRecipientMobilePhoneNotLike(String value) {
            addCriterion("recipient_mobile_phone not like", value, "recipientMobilePhone");
            return (Criteria) this;
        }

        public Criteria andRecipientMobilePhoneIn(List<String> values) {
            addCriterion("recipient_mobile_phone in", values, "recipientMobilePhone");
            return (Criteria) this;
        }

        public Criteria andRecipientMobilePhoneNotIn(List<String> values) {
            addCriterion("recipient_mobile_phone not in", values, "recipientMobilePhone");
            return (Criteria) this;
        }

        public Criteria andRecipientMobilePhoneBetween(String value1, String value2) {
            addCriterion("recipient_mobile_phone between", value1, value2, "recipientMobilePhone");
            return (Criteria) this;
        }

        public Criteria andRecipientMobilePhoneNotBetween(String value1, String value2) {
            addCriterion("recipient_mobile_phone not between", value1, value2, "recipientMobilePhone");
            return (Criteria) this;
        }

        public Criteria andRecipientMailIsNull() {
            addCriterion("recipient_mail is null");
            return (Criteria) this;
        }

        public Criteria andRecipientMailIsNotNull() {
            addCriterion("recipient_mail is not null");
            return (Criteria) this;
        }

        public Criteria andRecipientMailEqualTo(String value) {
            addCriterion("recipient_mail =", value, "recipientMail");
            return (Criteria) this;
        }

        public Criteria andRecipientMailNotEqualTo(String value) {
            addCriterion("recipient_mail <>", value, "recipientMail");
            return (Criteria) this;
        }

        public Criteria andRecipientMailGreaterThan(String value) {
            addCriterion("recipient_mail >", value, "recipientMail");
            return (Criteria) this;
        }

        public Criteria andRecipientMailGreaterThanOrEqualTo(String value) {
            addCriterion("recipient_mail >=", value, "recipientMail");
            return (Criteria) this;
        }

        public Criteria andRecipientMailLessThan(String value) {
            addCriterion("recipient_mail <", value, "recipientMail");
            return (Criteria) this;
        }

        public Criteria andRecipientMailLessThanOrEqualTo(String value) {
            addCriterion("recipient_mail <=", value, "recipientMail");
            return (Criteria) this;
        }

        public Criteria andRecipientMailLike(String value) {
            addCriterion("recipient_mail like", value, "recipientMail");
            return (Criteria) this;
        }

        public Criteria andRecipientMailNotLike(String value) {
            addCriterion("recipient_mail not like", value, "recipientMail");
            return (Criteria) this;
        }

        public Criteria andRecipientMailIn(List<String> values) {
            addCriterion("recipient_mail in", values, "recipientMail");
            return (Criteria) this;
        }

        public Criteria andRecipientMailNotIn(List<String> values) {
            addCriterion("recipient_mail not in", values, "recipientMail");
            return (Criteria) this;
        }

        public Criteria andRecipientMailBetween(String value1, String value2) {
            addCriterion("recipient_mail between", value1, value2, "recipientMail");
            return (Criteria) this;
        }

        public Criteria andRecipientMailNotBetween(String value1, String value2) {
            addCriterion("recipient_mail not between", value1, value2, "recipientMail");
            return (Criteria) this;
        }

        public Criteria andSignerIsNull() {
            addCriterion("signer is null");
            return (Criteria) this;
        }

        public Criteria andSignerIsNotNull() {
            addCriterion("signer is not null");
            return (Criteria) this;
        }

        public Criteria andSignerEqualTo(String value) {
            addCriterion("signer =", value, "signer");
            return (Criteria) this;
        }

        public Criteria andSignerNotEqualTo(String value) {
            addCriterion("signer <>", value, "signer");
            return (Criteria) this;
        }

        public Criteria andSignerGreaterThan(String value) {
            addCriterion("signer >", value, "signer");
            return (Criteria) this;
        }

        public Criteria andSignerGreaterThanOrEqualTo(String value) {
            addCriterion("signer >=", value, "signer");
            return (Criteria) this;
        }

        public Criteria andSignerLessThan(String value) {
            addCriterion("signer <", value, "signer");
            return (Criteria) this;
        }

        public Criteria andSignerLessThanOrEqualTo(String value) {
            addCriterion("signer <=", value, "signer");
            return (Criteria) this;
        }

        public Criteria andSignerLike(String value) {
            addCriterion("signer like", value, "signer");
            return (Criteria) this;
        }

        public Criteria andSignerNotLike(String value) {
            addCriterion("signer not like", value, "signer");
            return (Criteria) this;
        }

        public Criteria andSignerIn(List<String> values) {
            addCriterion("signer in", values, "signer");
            return (Criteria) this;
        }

        public Criteria andSignerNotIn(List<String> values) {
            addCriterion("signer not in", values, "signer");
            return (Criteria) this;
        }

        public Criteria andSignerBetween(String value1, String value2) {
            addCriterion("signer between", value1, value2, "signer");
            return (Criteria) this;
        }

        public Criteria andSignerNotBetween(String value1, String value2) {
            addCriterion("signer not between", value1, value2, "signer");
            return (Criteria) this;
        }

        public Criteria andSignerContactIsNull() {
            addCriterion("signer_contact is null");
            return (Criteria) this;
        }

        public Criteria andSignerContactIsNotNull() {
            addCriterion("signer_contact is not null");
            return (Criteria) this;
        }

        public Criteria andSignerContactEqualTo(String value) {
            addCriterion("signer_contact =", value, "signerContact");
            return (Criteria) this;
        }

        public Criteria andSignerContactNotEqualTo(String value) {
            addCriterion("signer_contact <>", value, "signerContact");
            return (Criteria) this;
        }

        public Criteria andSignerContactGreaterThan(String value) {
            addCriterion("signer_contact >", value, "signerContact");
            return (Criteria) this;
        }

        public Criteria andSignerContactGreaterThanOrEqualTo(String value) {
            addCriterion("signer_contact >=", value, "signerContact");
            return (Criteria) this;
        }

        public Criteria andSignerContactLessThan(String value) {
            addCriterion("signer_contact <", value, "signerContact");
            return (Criteria) this;
        }

        public Criteria andSignerContactLessThanOrEqualTo(String value) {
            addCriterion("signer_contact <=", value, "signerContact");
            return (Criteria) this;
        }

        public Criteria andSignerContactLike(String value) {
            addCriterion("signer_contact like", value, "signerContact");
            return (Criteria) this;
        }

        public Criteria andSignerContactNotLike(String value) {
            addCriterion("signer_contact not like", value, "signerContact");
            return (Criteria) this;
        }

        public Criteria andSignerContactIn(List<String> values) {
            addCriterion("signer_contact in", values, "signerContact");
            return (Criteria) this;
        }

        public Criteria andSignerContactNotIn(List<String> values) {
            addCriterion("signer_contact not in", values, "signerContact");
            return (Criteria) this;
        }

        public Criteria andSignerContactBetween(String value1, String value2) {
            addCriterion("signer_contact between", value1, value2, "signerContact");
            return (Criteria) this;
        }

        public Criteria andSignerContactNotBetween(String value1, String value2) {
            addCriterion("signer_contact not between", value1, value2, "signerContact");
            return (Criteria) this;
        }

        public Criteria andSendTimeIsNull() {
            addCriterion("send_time is null");
            return (Criteria) this;
        }

        public Criteria andSendTimeIsNotNull() {
            addCriterion("send_time is not null");
            return (Criteria) this;
        }

        public Criteria andSendTimeEqualTo(Date value) {
            addCriterion("send_time =", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotEqualTo(Date value) {
            addCriterion("send_time <>", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeGreaterThan(Date value) {
            addCriterion("send_time >", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("send_time >=", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLessThan(Date value) {
            addCriterion("send_time <", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLessThanOrEqualTo(Date value) {
            addCriterion("send_time <=", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeIn(List<Date> values) {
            addCriterion("send_time in", values, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotIn(List<Date> values) {
            addCriterion("send_time not in", values, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeBetween(Date value1, Date value2) {
            addCriterion("send_time between", value1, value2, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotBetween(Date value1, Date value2) {
            addCriterion("send_time not between", value1, value2, "sendTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeIsNull() {
            addCriterion("arrive_time is null");
            return (Criteria) this;
        }

        public Criteria andArriveTimeIsNotNull() {
            addCriterion("arrive_time is not null");
            return (Criteria) this;
        }

        public Criteria andArriveTimeEqualTo(Date value) {
            addCriterion("arrive_time =", value, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeNotEqualTo(Date value) {
            addCriterion("arrive_time <>", value, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeGreaterThan(Date value) {
            addCriterion("arrive_time >", value, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("arrive_time >=", value, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeLessThan(Date value) {
            addCriterion("arrive_time <", value, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeLessThanOrEqualTo(Date value) {
            addCriterion("arrive_time <=", value, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeIn(List<Date> values) {
            addCriterion("arrive_time in", values, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeNotIn(List<Date> values) {
            addCriterion("arrive_time not in", values, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeBetween(Date value1, Date value2) {
            addCriterion("arrive_time between", value1, value2, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeNotBetween(Date value1, Date value2) {
            addCriterion("arrive_time not between", value1, value2, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeIsNull() {
            addCriterion("sign_time is null");
            return (Criteria) this;
        }

        public Criteria andSignTimeIsNotNull() {
            addCriterion("sign_time is not null");
            return (Criteria) this;
        }

        public Criteria andSignTimeEqualTo(Date value) {
            addCriterion("sign_time =", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeNotEqualTo(Date value) {
            addCriterion("sign_time <>", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeGreaterThan(Date value) {
            addCriterion("sign_time >", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sign_time >=", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeLessThan(Date value) {
            addCriterion("sign_time <", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeLessThanOrEqualTo(Date value) {
            addCriterion("sign_time <=", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeIn(List<Date> values) {
            addCriterion("sign_time in", values, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeNotIn(List<Date> values) {
            addCriterion("sign_time not in", values, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeBetween(Date value1, Date value2) {
            addCriterion("sign_time between", value1, value2, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeNotBetween(Date value1, Date value2) {
            addCriterion("sign_time not between", value1, value2, "signTime");
            return (Criteria) this;
        }

        public Criteria andExpressFeeIsNull() {
            addCriterion("express_fee is null");
            return (Criteria) this;
        }

        public Criteria andExpressFeeIsNotNull() {
            addCriterion("express_fee is not null");
            return (Criteria) this;
        }

        public Criteria andExpressFeeEqualTo(Integer value) {
            addCriterion("express_fee =", value, "expressFee");
            return (Criteria) this;
        }

        public Criteria andExpressFeeNotEqualTo(Integer value) {
            addCriterion("express_fee <>", value, "expressFee");
            return (Criteria) this;
        }

        public Criteria andExpressFeeGreaterThan(Integer value) {
            addCriterion("express_fee >", value, "expressFee");
            return (Criteria) this;
        }

        public Criteria andExpressFeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("express_fee >=", value, "expressFee");
            return (Criteria) this;
        }

        public Criteria andExpressFeeLessThan(Integer value) {
            addCriterion("express_fee <", value, "expressFee");
            return (Criteria) this;
        }

        public Criteria andExpressFeeLessThanOrEqualTo(Integer value) {
            addCriterion("express_fee <=", value, "expressFee");
            return (Criteria) this;
        }

        public Criteria andExpressFeeIn(List<Integer> values) {
            addCriterion("express_fee in", values, "expressFee");
            return (Criteria) this;
        }

        public Criteria andExpressFeeNotIn(List<Integer> values) {
            addCriterion("express_fee not in", values, "expressFee");
            return (Criteria) this;
        }

        public Criteria andExpressFeeBetween(Integer value1, Integer value2) {
            addCriterion("express_fee between", value1, value2, "expressFee");
            return (Criteria) this;
        }

        public Criteria andExpressFeeNotBetween(Integer value1, Integer value2) {
            addCriterion("express_fee not between", value1, value2, "expressFee");
            return (Criteria) this;
        }

        public Criteria andIsPaidIsNull() {
            addCriterion("is_paid is null");
            return (Criteria) this;
        }

        public Criteria andIsPaidIsNotNull() {
            addCriterion("is_paid is not null");
            return (Criteria) this;
        }

        public Criteria andIsPaidEqualTo(Byte value) {
            addCriterion("is_paid =", value, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsPaidNotEqualTo(Byte value) {
            addCriterion("is_paid <>", value, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsPaidGreaterThan(Byte value) {
            addCriterion("is_paid >", value, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsPaidGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_paid >=", value, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsPaidLessThan(Byte value) {
            addCriterion("is_paid <", value, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsPaidLessThanOrEqualTo(Byte value) {
            addCriterion("is_paid <=", value, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsPaidIn(List<Byte> values) {
            addCriterion("is_paid in", values, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsPaidNotIn(List<Byte> values) {
            addCriterion("is_paid not in", values, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsPaidBetween(Byte value1, Byte value2) {
            addCriterion("is_paid between", value1, value2, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsPaidNotBetween(Byte value1, Byte value2) {
            addCriterion("is_paid not between", value1, value2, "isPaid");
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