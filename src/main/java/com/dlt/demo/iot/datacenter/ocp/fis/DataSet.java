package com.dlt.demo.iot.datacenter.ocp.fis;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "dataSet")
@XmlType(propOrder = {"timestamp", "deviceType", "deviceID", "count", "payload", "required", "average"})
public class DataSet {

    private String timestamp = "";
    private String deviceType = "";
    private String deviceID = "";
    private int count = 0;
    private int payload = 0;
    private int required = 0;
    private float average = 0;

    public DataSet() {
        super();
    }

    public DataSet(final String timestamp, final String deviceType, final String deviceID, final int count,
                   final int payload, final int required, final float average) {
        super();
        setTimestamp(timestamp);
        setDeviceType(deviceType);
        setDeviceID(deviceID);
        setCount(count);
        setPayload(payload);
        setRequired(required);
        setAverage(average);
    }

    public final String getTimestamp() {
        return timestamp;
    }

    public final void setTimestamp(final String timestamp) {
        this.timestamp = timestamp;
    }

    public final String getDeviceType() {
        return deviceType;
    }

    public final void setDeviceType(final String deviceType) {
        this.deviceType = deviceType;
    }

    public final String getDeviceID() {
        return deviceID;
    }

    public final void setDeviceID(final String deviceID) {
        this.deviceID = deviceID;
    }

    public final int getCount() {
        return count;
    }

    public final void setCount(final int count) {
        this.count = count;
    }

    public final int getPayload() {
        return payload;
    }

    public final void setPayload(final int payload) {
        this.payload = payload;
    }

    public final int getRequired() {
        return required;
    }

    public final void setRequired(final int required) {
        this.required = required;
    }

    public final float getAverage() {
        return average;
    }

    public final void setAverage(final float average) {
        this.average = average;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Float.floatToIntBits(average);
        result = prime * result + count;
        result = prime * result + ((deviceID == null) ? 0 : deviceID.hashCode());
        result = prime * result + ((deviceType == null) ? 0 : deviceType.hashCode());
        result = prime * result + payload;
        result = prime * result + required;
        result = prime * result + ((timestamp == null) ? 0 : timestamp.hashCode());
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof DataSet)) {
            return false;
        }
        DataSet other = (DataSet) obj;
        if (Float.floatToIntBits(average) != Float.floatToIntBits(other.average)) {
            return false;
        }
        if (count != other.count) {
            return false;
        }
        if (deviceID == null) {
            if (other.deviceID != null) {
                return false;
            }
        } else if (!deviceID.equals(other.deviceID)) {
            return false;
        }
        if (deviceType == null) {
            if (other.deviceType != null) {
                return false;
            }
        } else if (!deviceType.equals(other.deviceType)) {
            return false;
        }
        if (payload != other.payload) {
            return false;
        }
        if (required != other.required) {
            return false;
        }
        if (timestamp == null) {
            if (other.timestamp != null) {
                return false;
            }
        } else if (!timestamp.equals(other.timestamp)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DataSet.fis [timestamp=" + timestamp + ", deviceType=" + deviceType + ", deviceID=" + deviceID
                + ", count=" + count + ", payload=" + payload + ", required=" + required + ", average=" + average + "]";
    }

}
