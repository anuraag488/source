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
public final class re1 {

    /* JADX INFO: renamed from: b */
    public static final re1 f29204b;

    /* JADX INFO: renamed from: c */
    public static final re1 f29205c;

    /* JADX INFO: renamed from: d */
    public static final re1[] f29206d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ re1[] f29207e;

    /* JADX INFO: renamed from: a */
    public final byte f29208a;

    /* JADX INFO: Fake field, exist only in values array */
    re1 EF0;

    static {
        n82 n82Var = n82.DOUBLE;
        re1 re1Var = new re1("DOUBLE", 0, 0, 1, n82Var);
        n82 n82Var2 = n82.FLOAT;
        re1 re1Var2 = new re1("FLOAT", 1, 1, 1, n82Var2);
        n82 n82Var3 = n82.LONG;
        re1 re1Var3 = new re1("INT64", 2, 2, 1, n82Var3);
        re1 re1Var4 = new re1("UINT64", 3, 3, 1, n82Var3);
        n82 n82Var4 = n82.INT;
        re1 re1Var5 = new re1("INT32", 4, 4, 1, n82Var4);
        re1 re1Var6 = new re1("FIXED64", 5, 5, 1, n82Var3);
        re1 re1Var7 = new re1("FIXED32", 6, 6, 1, n82Var4);
        n82 n82Var5 = n82.BOOLEAN;
        re1 re1Var8 = new re1("BOOL", 7, 7, 1, n82Var5);
        n82 n82Var6 = n82.STRING;
        re1 re1Var9 = new re1("STRING", 8, 8, 1, n82Var6);
        n82 n82Var7 = n82.MESSAGE;
        re1 re1Var10 = new re1("MESSAGE", 9, 9, 1, n82Var7);
        n82 n82Var8 = n82.BYTE_STRING;
        re1 re1Var11 = new re1("BYTES", 10, 10, 1, n82Var8);
        re1 re1Var12 = new re1("UINT32", 11, 11, 1, n82Var4);
        n82 n82Var9 = n82.ENUM;
        re1 re1Var13 = new re1("ENUM", 12, 12, 1, n82Var9);
        re1 re1Var14 = new re1("SFIXED32", 13, 13, 1, n82Var4);
        re1 re1Var15 = new re1("SFIXED64", 14, 14, 1, n82Var3);
        re1 re1Var16 = new re1("SINT32", 15, 15, 1, n82Var4);
        re1 re1Var17 = new re1("SINT64", 16, 16, 1, n82Var3);
        re1 re1Var18 = new re1("GROUP", 17, 17, 1, n82Var7);
        re1 re1Var19 = new re1("DOUBLE_LIST", 18, 18, 2, n82Var);
        re1 re1Var20 = new re1("FLOAT_LIST", 19, 19, 2, n82Var2);
        re1 re1Var21 = new re1("INT64_LIST", 20, 20, 2, n82Var3);
        re1 re1Var22 = new re1("UINT64_LIST", 21, 21, 2, n82Var3);
        re1 re1Var23 = new re1("INT32_LIST", 22, 22, 2, n82Var4);
        re1 re1Var24 = new re1("FIXED64_LIST", 23, 23, 2, n82Var3);
        re1 re1Var25 = new re1("FIXED32_LIST", 24, 24, 2, n82Var4);
        re1 re1Var26 = new re1("BOOL_LIST", 25, 25, 2, n82Var5);
        re1 re1Var27 = new re1("STRING_LIST", 26, 26, 2, n82Var6);
        re1 re1Var28 = new re1("MESSAGE_LIST", 27, 27, 2, n82Var7);
        re1 re1Var29 = new re1("BYTES_LIST", 28, 28, 2, n82Var8);
        re1 re1Var30 = new re1("UINT32_LIST", 29, 29, 2, n82Var4);
        re1 re1Var31 = new re1("ENUM_LIST", 30, 30, 2, n82Var9);
        re1 re1Var32 = new re1("SFIXED32_LIST", 31, 31, 2, n82Var4);
        re1 re1Var33 = new re1("SFIXED64_LIST", 32, 32, 2, n82Var3);
        re1 re1Var34 = new re1("SINT32_LIST", 33, 33, 2, n82Var4);
        re1 re1Var35 = new re1("SINT64_LIST", 34, 34, 2, n82Var3);
        re1 re1Var36 = new re1("DOUBLE_LIST_PACKED", 35, 35, 3, n82Var);
        f29204b = re1Var36;
        re1 re1Var37 = new re1("FLOAT_LIST_PACKED", 36, 36, 3, n82Var2);
        re1 re1Var38 = new re1("INT64_LIST_PACKED", 37, 37, 3, n82Var3);
        re1 re1Var39 = new re1("UINT64_LIST_PACKED", 38, 38, 3, n82Var3);
        re1 re1Var40 = new re1("INT32_LIST_PACKED", 39, 39, 3, n82Var4);
        re1 re1Var41 = new re1("FIXED64_LIST_PACKED", 40, 40, 3, n82Var3);
        re1 re1Var42 = new re1("FIXED32_LIST_PACKED", 41, 41, 3, n82Var4);
        re1 re1Var43 = new re1("BOOL_LIST_PACKED", 42, 42, 3, n82Var5);
        re1 re1Var44 = new re1("UINT32_LIST_PACKED", 43, 43, 3, n82Var4);
        re1 re1Var45 = new re1("ENUM_LIST_PACKED", 44, 44, 3, n82Var9);
        re1 re1Var46 = new re1("SFIXED32_LIST_PACKED", 45, 45, 3, n82Var4);
        re1 re1Var47 = new re1("SFIXED64_LIST_PACKED", 46, 46, 3, n82Var3);
        re1 re1Var48 = new re1("SINT32_LIST_PACKED", 47, 47, 3, n82Var4);
        re1 re1Var49 = new re1("SINT64_LIST_PACKED", 48, 48, 3, n82Var3);
        f29205c = re1Var49;
        f29207e = new re1[]{re1Var, re1Var2, re1Var3, re1Var4, re1Var5, re1Var6, re1Var7, re1Var8, re1Var9, re1Var10, re1Var11, re1Var12, re1Var13, re1Var14, re1Var15, re1Var16, re1Var17, re1Var18, re1Var19, re1Var20, re1Var21, re1Var22, re1Var23, re1Var24, re1Var25, re1Var26, re1Var27, re1Var28, re1Var29, re1Var30, re1Var31, re1Var32, re1Var33, re1Var34, re1Var35, re1Var36, re1Var37, re1Var38, re1Var39, re1Var40, re1Var41, re1Var42, re1Var43, re1Var44, re1Var45, re1Var46, re1Var47, re1Var48, re1Var49, new re1("GROUP_LIST", 49, 49, 2, n82Var7), new re1("MAP", 50, 50, 4, n82.VOID)};
        re1[] re1VarArrValues = values();
        f29206d = new re1[re1VarArrValues.length];
        for (re1 re1Var50 : re1VarArrValues) {
            f29206d[re1Var50.f29208a] = re1Var50;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public re1(String str, int i, int i2, int i3, n82 n82Var) {
        super(str, i);
        this.f29208a = i2;
        int iM4376u = d55.m4376u(i3);
        if (iM4376u == 1 || iM4376u == 3) {
            Class cls = n82Var.f25530a;
        }
        if (i3 == 1) {
            n82Var.ordinal();
        }
    }

    public static re1 valueOf(String str) {
        return (re1) Enum.valueOf(re1.class, str);
    }

    public static re1[] values() {
        return (re1[]) f29207e.clone();
    }
}
