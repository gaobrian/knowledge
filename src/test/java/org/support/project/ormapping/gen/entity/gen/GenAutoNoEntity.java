package org.support.project.ormapping.gen.entity.gen;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

import java.sql.Timestamp;

import org.support.project.common.bean.ValidateError;
import org.support.project.common.validate.Validator;
import org.support.project.common.validate.ValidatorFactory;
import org.support.project.di.Container;
import org.support.project.di.DI;
import org.support.project.di.Instance;

/**
 * 採番のテストテーブル
 */
@DI(instance = Instance.Prototype)
public class GenAutoNoEntity implements Serializable {

    /** SerialVersion */
    private static final long serialVersionUID = 1L;

    /**
     * インスタンス取得 AOPに対応
     * 
     * @return インスタンス
     */
    public static GenAutoNoEntity get() {
        return Container.getComp(GenAutoNoEntity.class);
    }

    /**
     * コンストラクタ
     */
    public GenAutoNoEntity() {
        super();
    }

    /**
     * コンストラクタ
     * 
     * @param no
     *            番号
     */

    public GenAutoNoEntity(Long no) {
        super();
        this.no = no;
    }

    /** 番号 */
    private Long no;
    /** 文字列 */
    private String str;
    /** 登録ユーザ */
    private String insertUser;
    /** 登録日時 */
    private Timestamp insertDatetime;
    /** 更新ユーザ */
    private String updateUser;
    /** 更新日時 */
    private Timestamp updateDatetime;

    /**
     * 番号 を取得する
     */
    public Long getNo() {
        return this.no;
    }

    /**
     * 番号 を設定する
     * 
     * @param no
     *            番号
     */
    public GenAutoNoEntity setNo(Long no) {
        this.no = no;
        return this;
    }

    /**
     * 文字列 を取得する
     */
    public String getStr() {
        return this.str;
    }

    /**
     * 文字列 を設定する
     * 
     * @param str
     *            文字列
     */
    public GenAutoNoEntity setStr(String str) {
        this.str = str;
        return this;
    }

    /**
     * 登録ユーザ を取得する
     */
    public String getInsertUser() {
        return this.insertUser;
    }

    /**
     * 登録ユーザ を設定する
     * 
     * @param insertUser
     *            登録ユーザ
     */
    public GenAutoNoEntity setInsertUser(String insertUser) {
        this.insertUser = insertUser;
        return this;
    }

    /**
     * 登録日時 を取得する
     */
    public Timestamp getInsertDatetime() {
        return this.insertDatetime;
    }

    /**
     * 登録日時 を設定する
     * 
     * @param insertDatetime
     *            登録日時
     */
    public GenAutoNoEntity setInsertDatetime(Timestamp insertDatetime) {
        this.insertDatetime = insertDatetime;
        return this;
    }

    /**
     * 更新ユーザ を取得する
     */
    public String getUpdateUser() {
        return this.updateUser;
    }

    /**
     * 更新ユーザ を設定する
     * 
     * @param updateUser
     *            更新ユーザ
     */
    public GenAutoNoEntity setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
        return this;
    }

    /**
     * 更新日時 を取得する
     */
    public Timestamp getUpdateDatetime() {
        return this.updateDatetime;
    }

    /**
     * 更新日時 を設定する
     * 
     * @param updateDatetime
     *            更新日時
     */
    public GenAutoNoEntity setUpdateDatetime(Timestamp updateDatetime) {
        this.updateDatetime = updateDatetime;
        return this;
    }

    /**
     * キーの値を取得
     */
    public Object[] getKeyValues() {
        Object[] keyValues = new Object[1];
        keyValues[0] = this.no;
        return keyValues;
    }

    /**
     * キーの値を設定
     * 
     * @param no
     *            番号
     */
    public void setKeyValues(Long no) {
        this.no = no;
    }

    /**
     * キーで比較
     */
    public boolean equalsOnKey(GenAutoNoEntity entity) {
        Object[] keyValues1 = getKeyValues();
        Object[] keyValues2 = entity.getKeyValues();
        for (int i = 0; i < keyValues1.length; i++) {
            Object val1 = keyValues1[i];
            Object val2 = keyValues2[i];
            if (val1 == null && val2 != null) {
                return false;
            }
            if (val1 != null && val2 == null) {
                return false;
            }
            if (val1 != null && val2 != null) {
                if (!val1.equals(val2)) {
                    return false;
                }
            }

        }
        return true;
    }

    /**
     * ToString
     */
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("no = ").append(no).append("\n");
        builder.append("str = ").append(str).append("\n");
        builder.append("insertUser = ").append(insertUser).append("\n");
        builder.append("insertDatetime = ").append(insertDatetime).append("\n");
        builder.append("updateUser = ").append(updateUser).append("\n");
        builder.append("updateDatetime = ").append(updateDatetime).append("\n");
        return builder.toString();
    }

    /**
     * 表示用の名称を変換
     */
    protected String convLabelName(String label) {
        return label;
    }

    /**
     * validate
     */
    public List<ValidateError> validate() {
        List<ValidateError> errors = new ArrayList<>();
        Validator validator;
        ValidateError error;
        validator = ValidatorFactory.getInstance(Validator.MAX_LENGTH);
        error = validator.validate(this.str, convLabelName("Str"), 128);
        if (error != null) {
            errors.add(error);
        }
        validator = ValidatorFactory.getInstance(Validator.MAX_LENGTH);
        error = validator.validate(this.insertUser, convLabelName("Insert User"), 15);
        if (error != null) {
            errors.add(error);
        }
        validator = ValidatorFactory.getInstance(Validator.MAX_LENGTH);
        error = validator.validate(this.updateUser, convLabelName("Update User"), 15);
        if (error != null) {
            errors.add(error);
        }
        return errors;
    }

    /**
     * validate
     */
    public List<ValidateError> validate(Map<String, String> values) {
        List<ValidateError> errors = new ArrayList<>();
        Validator validator;
        ValidateError error;
        validator = ValidatorFactory.getInstance(Validator.MAX_LENGTH);
        error = validator.validate(values.get("str"), convLabelName("Str"), 128);
        if (error != null) {
            errors.add(error);
        }
        validator = ValidatorFactory.getInstance(Validator.MAX_LENGTH);
        error = validator.validate(values.get("insertUser"), convLabelName("Insert User"), 15);
        if (error != null) {
            errors.add(error);
        }
        validator = ValidatorFactory.getInstance(Validator.MAX_LENGTH);
        error = validator.validate(values.get("updateUser"), convLabelName("Update User"), 15);
        if (error != null) {
            errors.add(error);
        }
        return errors;
    }

}
