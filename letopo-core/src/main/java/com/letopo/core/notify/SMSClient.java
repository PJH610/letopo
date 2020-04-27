package com.letopo.core.notify;

import com.letopo.core.exception.ServiceException;

/**
 * @author jh
 * @version 1.0
 * @date 2020-04-25 15:31
 */
public interface SMSClient {

    public SMSResult sendRegisterVerify(String phone, String verifyCode) throws ServiceException;

    public SMSResult sendBindPhoneVerify(String phone, String verifyCode) throws ServiceException;

    public SMSResult sendResetPasswordVerify(String phone, String verifyCode) throws ServiceException;

    public SMSResult sendAdminLoginVerify(String phone,String verifyCode) throws ServiceException;


}
