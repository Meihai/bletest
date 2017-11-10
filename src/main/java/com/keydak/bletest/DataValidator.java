package com.keydak.bletest;

/**
 * Created by admin on 2017/11/2.
 */
public abstract class DataValidator {
    /**
     *
     * @param sendData 源数据
     * @param recvData 返回数据
     * @return < 0 验证失败，数据不完整，>=0 验证成功，返回的实际有效长度</>
     */
    public abstract int validate(final byte[] sendData, final byte[] recvData);
}
