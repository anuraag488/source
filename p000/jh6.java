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
public final class jh6 {

    /* JADX INFO: renamed from: b */
    public static final jh6 f22284b;

    /* JADX INFO: renamed from: c */
    public static final jh6 f22285c;

    /* JADX INFO: renamed from: d */
    public static final jh6[] f22286d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ jh6[] f22287e;

    /* JADX INFO: renamed from: a */
    public final byte f22288a;

    /* JADX INFO: Fake field, exist only in values array */
    jh6 EF0;

    static {
        ri6 ri6Var = ri6.DOUBLE;
        jh6 jh6Var = new jh6("DOUBLE", 0, 0, 1, ri6Var);
        ri6 ri6Var2 = ri6.FLOAT;
        jh6 jh6Var2 = new jh6("FLOAT", 1, 1, 1, ri6Var2);
        ri6 ri6Var3 = ri6.LONG;
        jh6 jh6Var3 = new jh6("INT64", 2, 2, 1, ri6Var3);
        jh6 jh6Var4 = new jh6("UINT64", 3, 3, 1, ri6Var3);
        ri6 ri6Var4 = ri6.INT;
        jh6 jh6Var5 = new jh6("INT32", 4, 4, 1, ri6Var4);
        jh6 jh6Var6 = new jh6("FIXED64", 5, 5, 1, ri6Var3);
        jh6 jh6Var7 = new jh6("FIXED32", 6, 6, 1, ri6Var4);
        ri6 ri6Var5 = ri6.BOOLEAN;
        jh6 jh6Var8 = new jh6("BOOL", 7, 7, 1, ri6Var5);
        ri6 ri6Var6 = ri6.STRING;
        jh6 jh6Var9 = new jh6("STRING", 8, 8, 1, ri6Var6);
        ri6 ri6Var7 = ri6.MESSAGE;
        jh6 jh6Var10 = new jh6("MESSAGE", 9, 9, 1, ri6Var7);
        ri6 ri6Var8 = ri6.BYTE_STRING;
        jh6 jh6Var11 = new jh6("BYTES", 10, 10, 1, ri6Var8);
        jh6 jh6Var12 = new jh6("UINT32", 11, 11, 1, ri6Var4);
        ri6 ri6Var9 = ri6.ENUM;
        jh6 jh6Var13 = new jh6("ENUM", 12, 12, 1, ri6Var9);
        jh6 jh6Var14 = new jh6("SFIXED32", 13, 13, 1, ri6Var4);
        jh6 jh6Var15 = new jh6("SFIXED64", 14, 14, 1, ri6Var3);
        jh6 jh6Var16 = new jh6("SINT32", 15, 15, 1, ri6Var4);
        jh6 jh6Var17 = new jh6("SINT64", 16, 16, 1, ri6Var3);
        jh6 jh6Var18 = new jh6("GROUP", 17, 17, 1, ri6Var7);
        jh6 jh6Var19 = new jh6("DOUBLE_LIST", 18, 18, 2, ri6Var);
        jh6 jh6Var20 = new jh6("FLOAT_LIST", 19, 19, 2, ri6Var2);
        jh6 jh6Var21 = new jh6("INT64_LIST", 20, 20, 2, ri6Var3);
        jh6 jh6Var22 = new jh6("UINT64_LIST", 21, 21, 2, ri6Var3);
        jh6 jh6Var23 = new jh6("INT32_LIST", 22, 22, 2, ri6Var4);
        jh6 jh6Var24 = new jh6("FIXED64_LIST", 23, 23, 2, ri6Var3);
        jh6 jh6Var25 = new jh6("FIXED32_LIST", 24, 24, 2, ri6Var4);
        jh6 jh6Var26 = new jh6("BOOL_LIST", 25, 25, 2, ri6Var5);
        jh6 jh6Var27 = new jh6("STRING_LIST", 26, 26, 2, ri6Var6);
        jh6 jh6Var28 = new jh6("MESSAGE_LIST", 27, 27, 2, ri6Var7);
        jh6 jh6Var29 = new jh6("BYTES_LIST", 28, 28, 2, ri6Var8);
        jh6 jh6Var30 = new jh6("UINT32_LIST", 29, 29, 2, ri6Var4);
        jh6 jh6Var31 = new jh6("ENUM_LIST", 30, 30, 2, ri6Var9);
        jh6 jh6Var32 = new jh6("SFIXED32_LIST", 31, 31, 2, ri6Var4);
        jh6 jh6Var33 = new jh6("SFIXED64_LIST", 32, 32, 2, ri6Var3);
        jh6 jh6Var34 = new jh6("SINT32_LIST", 33, 33, 2, ri6Var4);
        jh6 jh6Var35 = new jh6("SINT64_LIST", 34, 34, 2, ri6Var3);
        jh6 jh6Var36 = new jh6("DOUBLE_LIST_PACKED", 35, 35, 3, ri6Var);
        f22284b = jh6Var36;
        jh6 jh6Var37 = new jh6("FLOAT_LIST_PACKED", 36, 36, 3, ri6Var2);
        jh6 jh6Var38 = new jh6("INT64_LIST_PACKED", 37, 37, 3, ri6Var3);
        jh6 jh6Var39 = new jh6("UINT64_LIST_PACKED", 38, 38, 3, ri6Var3);
        jh6 jh6Var40 = new jh6("INT32_LIST_PACKED", 39, 39, 3, ri6Var4);
        jh6 jh6Var41 = new jh6("FIXED64_LIST_PACKED", 40, 40, 3, ri6Var3);
        jh6 jh6Var42 = new jh6("FIXED32_LIST_PACKED", 41, 41, 3, ri6Var4);
        jh6 jh6Var43 = new jh6("BOOL_LIST_PACKED", 42, 42, 3, ri6Var5);
        jh6 jh6Var44 = new jh6("UINT32_LIST_PACKED", 43, 43, 3, ri6Var4);
        jh6 jh6Var45 = new jh6("ENUM_LIST_PACKED", 44, 44, 3, ri6Var9);
        jh6 jh6Var46 = new jh6("SFIXED32_LIST_PACKED", 45, 45, 3, ri6Var4);
        jh6 jh6Var47 = new jh6("SFIXED64_LIST_PACKED", 46, 46, 3, ri6Var3);
        jh6 jh6Var48 = new jh6("SINT32_LIST_PACKED", 47, 47, 3, ri6Var4);
        jh6 jh6Var49 = new jh6("SINT64_LIST_PACKED", 48, 48, 3, ri6Var3);
        f22285c = jh6Var49;
        f22287e = new jh6[]{jh6Var, jh6Var2, jh6Var3, jh6Var4, jh6Var5, jh6Var6, jh6Var7, jh6Var8, jh6Var9, jh6Var10, jh6Var11, jh6Var12, jh6Var13, jh6Var14, jh6Var15, jh6Var16, jh6Var17, jh6Var18, jh6Var19, jh6Var20, jh6Var21, jh6Var22, jh6Var23, jh6Var24, jh6Var25, jh6Var26, jh6Var27, jh6Var28, jh6Var29, jh6Var30, jh6Var31, jh6Var32, jh6Var33, jh6Var34, jh6Var35, jh6Var36, jh6Var37, jh6Var38, jh6Var39, jh6Var40, jh6Var41, jh6Var42, jh6Var43, jh6Var44, jh6Var45, jh6Var46, jh6Var47, jh6Var48, jh6Var49, new jh6("GROUP_LIST", 49, 49, 2, ri6Var7), new jh6("MAP", 50, 50, 4, ri6.VOID)};
        jh6[] jh6VarArrValues = values();
        f22286d = new jh6[jh6VarArrValues.length];
        for (jh6 jh6Var50 : jh6VarArrValues) {
            f22286d[jh6Var50.f22288a] = jh6Var50;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public jh6(String str, int i, int i2, int i3, ri6 ri6Var) {
        super(str, i);
        this.f22288a = i2;
        int i4 = i3 - 1;
        if (i4 == 1 || i4 == 3) {
            Class cls = ri6Var.f29336a;
        }
        if (i3 == 1) {
            ri6 ri6Var2 = ri6.VOID;
            ri6Var.ordinal();
        }
    }

    public static jh6[] values() {
        return (jh6[]) f22287e.clone();
    }
}
