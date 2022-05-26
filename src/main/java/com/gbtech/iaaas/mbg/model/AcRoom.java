package com.gbtech.iaaas.mbg.model;

import java.io.Serializable;
import java.util.Date;

public class AcRoom implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ac_room.id
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ac_room.ac_id
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    private Integer acId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ac_room.room_num
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    private String roomNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ac_room.sub_room_num
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    private String subRoomNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ac_room.type
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    private Byte type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ac_room.floor
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    private Integer floor;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ac_room.status
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    private Byte status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ac_room.create_time
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ac_room.modify_time
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    private Date modifyTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ac_room.materials
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    private String materials;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ac_room
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ac_room.id
     *
     * @return the value of ac_room.id
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ac_room.id
     *
     * @param id the value for ac_room.id
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ac_room.ac_id
     *
     * @return the value of ac_room.ac_id
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public Integer getAcId() {
        return acId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ac_room.ac_id
     *
     * @param acId the value for ac_room.ac_id
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public void setAcId(Integer acId) {
        this.acId = acId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ac_room.room_num
     *
     * @return the value of ac_room.room_num
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public String getRoomNum() {
        return roomNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ac_room.room_num
     *
     * @param roomNum the value for ac_room.room_num
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public void setRoomNum(String roomNum) {
        this.roomNum = roomNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ac_room.sub_room_num
     *
     * @return the value of ac_room.sub_room_num
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public String getSubRoomNum() {
        return subRoomNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ac_room.sub_room_num
     *
     * @param subRoomNum the value for ac_room.sub_room_num
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public void setSubRoomNum(String subRoomNum) {
        this.subRoomNum = subRoomNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ac_room.type
     *
     * @return the value of ac_room.type
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public Byte getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ac_room.type
     *
     * @param type the value for ac_room.type
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ac_room.floor
     *
     * @return the value of ac_room.floor
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public Integer getFloor() {
        return floor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ac_room.floor
     *
     * @param floor the value for ac_room.floor
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ac_room.status
     *
     * @return the value of ac_room.status
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ac_room.status
     *
     * @param status the value for ac_room.status
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ac_room.create_time
     *
     * @return the value of ac_room.create_time
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ac_room.create_time
     *
     * @param createTime the value for ac_room.create_time
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ac_room.modify_time
     *
     * @return the value of ac_room.modify_time
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ac_room.modify_time
     *
     * @param modifyTime the value for ac_room.modify_time
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ac_room.materials
     *
     * @return the value of ac_room.materials
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public String getMaterials() {
        return materials;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ac_room.materials
     *
     * @param materials the value for ac_room.materials
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    public void setMaterials(String materials) {
        this.materials = materials;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_room
     *
     * @mbg.generated Wed May 25 07:04:03 BST 2022
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", acId=").append(acId);
        sb.append(", roomNum=").append(roomNum);
        sb.append(", subRoomNum=").append(subRoomNum);
        sb.append(", type=").append(type);
        sb.append(", floor=").append(floor);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", materials=").append(materials);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}