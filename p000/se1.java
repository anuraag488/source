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
public final class se1 {

    /* JADX INFO: renamed from: b */
    public static final se1 f30208b;

    /* JADX INFO: renamed from: c */
    public static final se1 f30209c;

    /* JADX INFO: renamed from: d */
    public static final se1[] f30210d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ se1[] f30211e;

    /* JADX INFO: renamed from: a */
    public final byte f30212a;

    /* JADX INFO: Fake field, exist only in values array */
    se1 EF0;

    static {
        o82 o82Var = o82.DOUBLE;
        se1 se1Var = new se1("DOUBLE", 0, 0, 1, o82Var);
        o82 o82Var2 = o82.FLOAT;
        se1 se1Var2 = new se1("FLOAT", 1, 1, 1, o82Var2);
        o82 o82Var3 = o82.LONG;
        se1 se1Var3 = new se1("INT64", 2, 2, 1, o82Var3);
        se1 se1Var4 = new se1("UINT64", 3, 3, 1, o82Var3);
        o82 o82Var4 = o82.INT;
        se1 se1Var5 = new se1("INT32", 4, 4, 1, o82Var4);
        se1 se1Var6 = new se1("FIXED64", 5, 5, 1, o82Var3);
        se1 se1Var7 = new se1("FIXED32", 6, 6, 1, o82Var4);
        o82 o82Var5 = o82.BOOLEAN;
        se1 se1Var8 = new se1("BOOL", 7, 7, 1, o82Var5);
        o82 o82Var6 = o82.STRING;
        se1 se1Var9 = new se1("STRING", 8, 8, 1, o82Var6);
        o82 o82Var7 = o82.MESSAGE;
        se1 se1Var10 = new se1("MESSAGE", 9, 9, 1, o82Var7);
        o82 o82Var8 = o82.BYTE_STRING;
        se1 se1Var11 = new se1("BYTES", 10, 10, 1, o82Var8);
        se1 se1Var12 = new se1("UINT32", 11, 11, 1, o82Var4);
        o82 o82Var9 = o82.ENUM;
        se1 se1Var13 = new se1("ENUM", 12, 12, 1, o82Var9);
        se1 se1Var14 = new se1("SFIXED32", 13, 13, 1, o82Var4);
        se1 se1Var15 = new se1("SFIXED64", 14, 14, 1, o82Var3);
        se1 se1Var16 = new se1("SINT32", 15, 15, 1, o82Var4);
        se1 se1Var17 = new se1("SINT64", 16, 16, 1, o82Var3);
        se1 se1Var18 = new se1("GROUP", 17, 17, 1, o82Var7);
        se1 se1Var19 = new se1("DOUBLE_LIST", 18, 18, 2, o82Var);
        se1 se1Var20 = new se1("FLOAT_LIST", 19, 19, 2, o82Var2);
        se1 se1Var21 = new se1("INT64_LIST", 20, 20, 2, o82Var3);
        se1 se1Var22 = new se1("UINT64_LIST", 21, 21, 2, o82Var3);
        se1 se1Var23 = new se1("INT32_LIST", 22, 22, 2, o82Var4);
        se1 se1Var24 = new se1("FIXED64_LIST", 23, 23, 2, o82Var3);
        se1 se1Var25 = new se1("FIXED32_LIST", 24, 24, 2, o82Var4);
        se1 se1Var26 = new se1("BOOL_LIST", 25, 25, 2, o82Var5);
        se1 se1Var27 = new se1("STRING_LIST", 26, 26, 2, o82Var6);
        se1 se1Var28 = new se1("MESSAGE_LIST", 27, 27, 2, o82Var7);
        se1 se1Var29 = new se1("BYTES_LIST", 28, 28, 2, o82Var8);
        se1 se1Var30 = new se1("UINT32_LIST", 29, 29, 2, o82Var4);
        se1 se1Var31 = new se1("ENUM_LIST", 30, 30, 2, o82Var9);
        se1 se1Var32 = new se1("SFIXED32_LIST", 31, 31, 2, o82Var4);
        se1 se1Var33 = new se1("SFIXED64_LIST", 32, 32, 2, o82Var3);
        se1 se1Var34 = new se1("SINT32_LIST", 33, 33, 2, o82Var4);
        se1 se1Var35 = new se1("SINT64_LIST", 34, 34, 2, o82Var3);
        se1 se1Var36 = new se1("DOUBLE_LIST_PACKED", 35, 35, 3, o82Var);
        f30208b = se1Var36;
        se1 se1Var37 = new se1("FLOAT_LIST_PACKED", 36, 36, 3, o82Var2);
        se1 se1Var38 = new se1("INT64_LIST_PACKED", 37, 37, 3, o82Var3);
        se1 se1Var39 = new se1("UINT64_LIST_PACKED", 38, 38, 3, o82Var3);
        se1 se1Var40 = new se1("INT32_LIST_PACKED", 39, 39, 3, o82Var4);
        se1 se1Var41 = new se1("FIXED64_LIST_PACKED", 40, 40, 3, o82Var3);
        se1 se1Var42 = new se1("FIXED32_LIST_PACKED", 41, 41, 3, o82Var4);
        se1 se1Var43 = new se1("BOOL_LIST_PACKED", 42, 42, 3, o82Var5);
        se1 se1Var44 = new se1("UINT32_LIST_PACKED", 43, 43, 3, o82Var4);
        se1 se1Var45 = new se1("ENUM_LIST_PACKED", 44, 44, 3, o82Var9);
        se1 se1Var46 = new se1("SFIXED32_LIST_PACKED", 45, 45, 3, o82Var4);
        se1 se1Var47 = new se1("SFIXED64_LIST_PACKED", 46, 46, 3, o82Var3);
        se1 se1Var48 = new se1("SINT32_LIST_PACKED", 47, 47, 3, o82Var4);
        se1 se1Var49 = new se1("SINT64_LIST_PACKED", 48, 48, 3, o82Var3);
        f30209c = se1Var49;
        f30211e = new se1[]{se1Var, se1Var2, se1Var3, se1Var4, se1Var5, se1Var6, se1Var7, se1Var8, se1Var9, se1Var10, se1Var11, se1Var12, se1Var13, se1Var14, se1Var15, se1Var16, se1Var17, se1Var18, se1Var19, se1Var20, se1Var21, se1Var22, se1Var23, se1Var24, se1Var25, se1Var26, se1Var27, se1Var28, se1Var29, se1Var30, se1Var31, se1Var32, se1Var33, se1Var34, se1Var35, se1Var36, se1Var37, se1Var38, se1Var39, se1Var40, se1Var41, se1Var42, se1Var43, se1Var44, se1Var45, se1Var46, se1Var47, se1Var48, se1Var49, new se1("GROUP_LIST", 49, 49, 2, o82Var7), new se1("MAP", 50, 50, 4, o82.VOID)};
        se1[] se1VarArrValues = values();
        f30210d = new se1[se1VarArrValues.length];
        for (se1 se1Var50 : se1VarArrValues) {
            f30210d[se1Var50.f30212a] = se1Var50;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public se1(String str, int i, int i2, int i3, o82 o82Var) {
        super(str, i);
        this.f30212a = i2;
        int iM4376u = d55.m4376u(i3);
        if (iM4376u == 1 || iM4376u == 3) {
            Class cls = o82Var.f26437a;
        }
        if (i3 == 1) {
            o82Var.ordinal();
        }
    }

    public static se1 valueOf(String str) {
        return (se1) Enum.valueOf(se1.class, str);
    }

    public static se1[] values() {
        return (se1[]) f30211e.clone();
    }
}
