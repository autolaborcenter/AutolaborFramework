package cn.autolabor.message.navigation;

import cn.autolabor.util.autobuf.SerializableMessage;

public class Msg2DPose implements SerializableMessage {

    private double x;
    private double y;
    private double yaw;

    public Msg2DPose() {
    }

    public Msg2DPose(double x, double y, double yaw) {
        this.x = x;
        this.y = y;
        this.yaw = yaw;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getYaw() {
        return yaw;
    }

    public void setYaw(double yaw) {
        this.yaw = yaw;
    }

    @Override
    public String toString() {
        return "Msg2DPose{" +
                "x=" + x +
                ", y=" + y +
                ", yaw=" + yaw +
                '}';
    }
}
