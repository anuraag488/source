package p000;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class tp5 {

    /* JADX INFO: renamed from: b */
    public static final tp5 f31315b;

    /* JADX INFO: renamed from: c */
    public static final tp5 f31316c;

    /* JADX INFO: renamed from: d */
    public static final tp5[] f31317d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ tp5[] f31318e;

    /* JADX INFO: renamed from: a */
    public final byte f31319a;

    /* JADX INFO: Fake field, exist only in values array */
    tp5 EF0;

    static {
        xs5 xs5Var = xs5.DOUBLE;
        tp5 tp5Var = new tp5("DOUBLE", 0, 0, 1, xs5Var);
        xs5 xs5Var2 = xs5.FLOAT;
        tp5 tp5Var2 = new tp5("FLOAT", 1, 1, 1, xs5Var2);
        xs5 xs5Var3 = xs5.LONG;
        tp5 tp5Var3 = new tp5("INT64", 2, 2, 1, xs5Var3);
        tp5 tp5Var4 = new tp5("UINT64", 3, 3, 1, xs5Var3);
        xs5 xs5Var4 = xs5.INT;
        tp5 tp5Var5 = new tp5("INT32", 4, 4, 1, xs5Var4);
        tp5 tp5Var6 = new tp5("FIXED64", 5, 5, 1, xs5Var3);
        tp5 tp5Var7 = new tp5("FIXED32", 6, 6, 1, xs5Var4);
        xs5 xs5Var5 = xs5.BOOLEAN;
        tp5 tp5Var8 = new tp5("BOOL", 7, 7, 1, xs5Var5);
        xs5 xs5Var6 = xs5.STRING;
        tp5 tp5Var9 = new tp5("STRING", 8, 8, 1, xs5Var6);
        xs5 xs5Var7 = xs5.MESSAGE;
        tp5 tp5Var10 = new tp5("MESSAGE", 9, 9, 1, xs5Var7);
        xs5 xs5Var8 = xs5.BYTE_STRING;
        tp5 tp5Var11 = new tp5("BYTES", 10, 10, 1, xs5Var8);
        tp5 tp5Var12 = new tp5("UINT32", 11, 11, 1, xs5Var4);
        xs5 xs5Var9 = xs5.ENUM;
        tp5 tp5Var13 = new tp5("ENUM", 12, 12, 1, xs5Var9);
        tp5 tp5Var14 = new tp5("SFIXED32", 13, 13, 1, xs5Var4);
        tp5 tp5Var15 = new tp5("SFIXED64", 14, 14, 1, xs5Var3);
        tp5 tp5Var16 = new tp5("SINT32", 15, 15, 1, xs5Var4);
        tp5 tp5Var17 = new tp5("SINT64", 16, 16, 1, xs5Var3);
        tp5 tp5Var18 = new tp5("GROUP", 17, 17, 1, xs5Var7);
        tp5 tp5Var19 = new tp5("DOUBLE_LIST", 18, 18, 2, xs5Var);
        tp5 tp5Var20 = new tp5("FLOAT_LIST", 19, 19, 2, xs5Var2);
        tp5 tp5Var21 = new tp5("INT64_LIST", 20, 20, 2, xs5Var3);
        tp5 tp5Var22 = new tp5("UINT64_LIST", 21, 21, 2, xs5Var3);
        tp5 tp5Var23 = new tp5("INT32_LIST", 22, 22, 2, xs5Var4);
        tp5 tp5Var24 = new tp5("FIXED64_LIST", 23, 23, 2, xs5Var3);
        tp5 tp5Var25 = new tp5("FIXED32_LIST", 24, 24, 2, xs5Var4);
        tp5 tp5Var26 = new tp5("BOOL_LIST", 25, 25, 2, xs5Var5);
        tp5 tp5Var27 = new tp5("STRING_LIST", 26, 26, 2, xs5Var6);
        tp5 tp5Var28 = new tp5("MESSAGE_LIST", 27, 27, 2, xs5Var7);
        tp5 tp5Var29 = new tp5("BYTES_LIST", 28, 28, 2, xs5Var8);
        tp5 tp5Var30 = new tp5("UINT32_LIST", 29, 29, 2, xs5Var4);
        tp5 tp5Var31 = new tp5("ENUM_LIST", 30, 30, 2, xs5Var9);
        tp5 tp5Var32 = new tp5("SFIXED32_LIST", 31, 31, 2, xs5Var4);
        tp5 tp5Var33 = new tp5("SFIXED64_LIST", 32, 32, 2, xs5Var3);
        tp5 tp5Var34 = new tp5("SINT32_LIST", 33, 33, 2, xs5Var4);
        tp5 tp5Var35 = new tp5("SINT64_LIST", 34, 34, 2, xs5Var3);
        tp5 tp5Var36 = new tp5("DOUBLE_LIST_PACKED", 35, 35, 3, xs5Var);
        f31315b = tp5Var36;
        tp5 tp5Var37 = new tp5("FLOAT_LIST_PACKED", 36, 36, 3, xs5Var2);
        tp5 tp5Var38 = new tp5("INT64_LIST_PACKED", 37, 37, 3, xs5Var3);
        tp5 tp5Var39 = new tp5("UINT64_LIST_PACKED", 38, 38, 3, xs5Var3);
        tp5 tp5Var40 = new tp5("INT32_LIST_PACKED", 39, 39, 3, xs5Var4);
        tp5 tp5Var41 = new tp5("FIXED64_LIST_PACKED", 40, 40, 3, xs5Var3);
        tp5 tp5Var42 = new tp5("FIXED32_LIST_PACKED", 41, 41, 3, xs5Var4);
        tp5 tp5Var43 = new tp5("BOOL_LIST_PACKED", 42, 42, 3, xs5Var5);
        tp5 tp5Var44 = new tp5("UINT32_LIST_PACKED", 43, 43, 3, xs5Var4);
        tp5 tp5Var45 = new tp5("ENUM_LIST_PACKED", 44, 44, 3, xs5Var9);
        tp5 tp5Var46 = new tp5("SFIXED32_LIST_PACKED", 45, 45, 3, xs5Var4);
        tp5 tp5Var47 = new tp5("SFIXED64_LIST_PACKED", 46, 46, 3, xs5Var3);
        tp5 tp5Var48 = new tp5("SINT32_LIST_PACKED", 47, 47, 3, xs5Var4);
        tp5 tp5Var49 = new tp5("SINT64_LIST_PACKED", 48, 48, 3, xs5Var3);
        f31316c = tp5Var49;
        f31318e = new tp5[]{tp5Var, tp5Var2, tp5Var3, tp5Var4, tp5Var5, tp5Var6, tp5Var7, tp5Var8, tp5Var9, tp5Var10, tp5Var11, tp5Var12, tp5Var13, tp5Var14, tp5Var15, tp5Var16, tp5Var17, tp5Var18, tp5Var19, tp5Var20, tp5Var21, tp5Var22, tp5Var23, tp5Var24, tp5Var25, tp5Var26, tp5Var27, tp5Var28, tp5Var29, tp5Var30, tp5Var31, tp5Var32, tp5Var33, tp5Var34, tp5Var35, tp5Var36, tp5Var37, tp5Var38, tp5Var39, tp5Var40, tp5Var41, tp5Var42, tp5Var43, tp5Var44, tp5Var45, tp5Var46, tp5Var47, tp5Var48, tp5Var49, new tp5("GROUP_LIST", 49, 49, 2, xs5Var7), new tp5("MAP", 50, 50, 4, xs5.VOID)};
        tp5[] tp5VarArrValues = values();
        f31317d = new tp5[tp5VarArrValues.length];
        for (tp5 tp5Var50 : tp5VarArrValues) {
            f31317d[tp5Var50.f31319a] = tp5Var50;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public tp5(String str, int i, int i2, int i3, xs5 xs5Var) {
        super(str, i);
        this.f31319a = i2;
        int i4 = i3 - 1;
        if (i4 == 1 || i4 == 3) {
            Class cls = xs5Var.f34610a;
        }
        if (i3 == 1) {
            xs5 xs5Var2 = xs5.VOID;
            xs5Var.ordinal();
        }
    }

    public static tp5[] values() {
        return (tp5[]) f31318e.clone();
    }
}
