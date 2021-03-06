package cn.autolabor.module.networkhub.dependency;

/**
 * 组件
 * 通过类型反射、哈希值和判等条件与其他组件区分开
 * 因此组件可以安全快捷地保存到一个哈希集合中
 */
public interface Component {
    @Override
    boolean equals(Object other);

    @Override
    int hashCode();
}
