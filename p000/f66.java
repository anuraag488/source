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
public final class f66 {

    /* JADX INFO: renamed from: b */
    public static final f66 f18792b;

    /* JADX INFO: renamed from: c */
    public static final f66 f18793c;

    /* JADX INFO: renamed from: d */
    public static final f66[] f18794d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ f66[] f18795e;

    /* JADX INFO: renamed from: a */
    public final byte f18796a;

    /* JADX INFO: Fake field, exist only in values array */
    f66 EF0;

    static {
        j86 j86Var = j86.DOUBLE;
        f66 f66Var = new f66("DOUBLE", 0, 0, 1, j86Var);
        j86 j86Var2 = j86.FLOAT;
        f66 f66Var2 = new f66("FLOAT", 1, 1, 1, j86Var2);
        j86 j86Var3 = j86.LONG;
        f66 f66Var3 = new f66("INT64", 2, 2, 1, j86Var3);
        f66 f66Var4 = new f66("UINT64", 3, 3, 1, j86Var3);
        j86 j86Var4 = j86.INT;
        f66 f66Var5 = new f66("INT32", 4, 4, 1, j86Var4);
        f66 f66Var6 = new f66("FIXED64", 5, 5, 1, j86Var3);
        f66 f66Var7 = new f66("FIXED32", 6, 6, 1, j86Var4);
        j86 j86Var5 = j86.BOOLEAN;
        f66 f66Var8 = new f66("BOOL", 7, 7, 1, j86Var5);
        j86 j86Var6 = j86.STRING;
        f66 f66Var9 = new f66("STRING", 8, 8, 1, j86Var6);
        j86 j86Var7 = j86.MESSAGE;
        f66 f66Var10 = new f66("MESSAGE", 9, 9, 1, j86Var7);
        j86 j86Var8 = j86.BYTE_STRING;
        f66 f66Var11 = new f66("BYTES", 10, 10, 1, j86Var8);
        f66 f66Var12 = new f66("UINT32", 11, 11, 1, j86Var4);
        j86 j86Var9 = j86.ENUM;
        f66 f66Var13 = new f66("ENUM", 12, 12, 1, j86Var9);
        f66 f66Var14 = new f66("SFIXED32", 13, 13, 1, j86Var4);
        f66 f66Var15 = new f66("SFIXED64", 14, 14, 1, j86Var3);
        f66 f66Var16 = new f66("SINT32", 15, 15, 1, j86Var4);
        f66 f66Var17 = new f66("SINT64", 16, 16, 1, j86Var3);
        f66 f66Var18 = new f66("GROUP", 17, 17, 1, j86Var7);
        f66 f66Var19 = new f66("DOUBLE_LIST", 18, 18, 2, j86Var);
        f66 f66Var20 = new f66("FLOAT_LIST", 19, 19, 2, j86Var2);
        f66 f66Var21 = new f66("INT64_LIST", 20, 20, 2, j86Var3);
        f66 f66Var22 = new f66("UINT64_LIST", 21, 21, 2, j86Var3);
        f66 f66Var23 = new f66("INT32_LIST", 22, 22, 2, j86Var4);
        f66 f66Var24 = new f66("FIXED64_LIST", 23, 23, 2, j86Var3);
        f66 f66Var25 = new f66("FIXED32_LIST", 24, 24, 2, j86Var4);
        f66 f66Var26 = new f66("BOOL_LIST", 25, 25, 2, j86Var5);
        f66 f66Var27 = new f66("STRING_LIST", 26, 26, 2, j86Var6);
        f66 f66Var28 = new f66("MESSAGE_LIST", 27, 27, 2, j86Var7);
        f66 f66Var29 = new f66("BYTES_LIST", 28, 28, 2, j86Var8);
        f66 f66Var30 = new f66("UINT32_LIST", 29, 29, 2, j86Var4);
        f66 f66Var31 = new f66("ENUM_LIST", 30, 30, 2, j86Var9);
        f66 f66Var32 = new f66("SFIXED32_LIST", 31, 31, 2, j86Var4);
        f66 f66Var33 = new f66("SFIXED64_LIST", 32, 32, 2, j86Var3);
        f66 f66Var34 = new f66("SINT32_LIST", 33, 33, 2, j86Var4);
        f66 f66Var35 = new f66("SINT64_LIST", 34, 34, 2, j86Var3);
        f66 f66Var36 = new f66("DOUBLE_LIST_PACKED", 35, 35, 3, j86Var);
        f18792b = f66Var36;
        f66 f66Var37 = new f66("FLOAT_LIST_PACKED", 36, 36, 3, j86Var2);
        f66 f66Var38 = new f66("INT64_LIST_PACKED", 37, 37, 3, j86Var3);
        f66 f66Var39 = new f66("UINT64_LIST_PACKED", 38, 38, 3, j86Var3);
        f66 f66Var40 = new f66("INT32_LIST_PACKED", 39, 39, 3, j86Var4);
        f66 f66Var41 = new f66("FIXED64_LIST_PACKED", 40, 40, 3, j86Var3);
        f66 f66Var42 = new f66("FIXED32_LIST_PACKED", 41, 41, 3, j86Var4);
        f66 f66Var43 = new f66("BOOL_LIST_PACKED", 42, 42, 3, j86Var5);
        f66 f66Var44 = new f66("UINT32_LIST_PACKED", 43, 43, 3, j86Var4);
        f66 f66Var45 = new f66("ENUM_LIST_PACKED", 44, 44, 3, j86Var9);
        f66 f66Var46 = new f66("SFIXED32_LIST_PACKED", 45, 45, 3, j86Var4);
        f66 f66Var47 = new f66("SFIXED64_LIST_PACKED", 46, 46, 3, j86Var3);
        f66 f66Var48 = new f66("SINT32_LIST_PACKED", 47, 47, 3, j86Var4);
        f66 f66Var49 = new f66("SINT64_LIST_PACKED", 48, 48, 3, j86Var3);
        f18793c = f66Var49;
        f18795e = new f66[]{f66Var, f66Var2, f66Var3, f66Var4, f66Var5, f66Var6, f66Var7, f66Var8, f66Var9, f66Var10, f66Var11, f66Var12, f66Var13, f66Var14, f66Var15, f66Var16, f66Var17, f66Var18, f66Var19, f66Var20, f66Var21, f66Var22, f66Var23, f66Var24, f66Var25, f66Var26, f66Var27, f66Var28, f66Var29, f66Var30, f66Var31, f66Var32, f66Var33, f66Var34, f66Var35, f66Var36, f66Var37, f66Var38, f66Var39, f66Var40, f66Var41, f66Var42, f66Var43, f66Var44, f66Var45, f66Var46, f66Var47, f66Var48, f66Var49, new f66("GROUP_LIST", 49, 49, 2, j86Var7), new f66("MAP", 50, 50, 4, j86.VOID)};
        f66[] f66VarArrValues = values();
        f18794d = new f66[f66VarArrValues.length];
        for (f66 f66Var50 : f66VarArrValues) {
            f18794d[f66Var50.f18796a] = f66Var50;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f66(String str, int i, int i2, int i3, j86 j86Var) {
        super(str, i);
        this.f18796a = i2;
        int i4 = i3 - 1;
        if (i4 == 1 || i4 == 3) {
            Class cls = j86Var.f22103a;
        }
        if (i3 == 1) {
            j86 j86Var2 = j86.VOID;
            j86Var.ordinal();
        }
    }

    public static f66[] values() {
        return (f66[]) f18795e.clone();
    }
}
