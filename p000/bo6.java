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
public final class bo6 {

    /* JADX INFO: renamed from: b */
    public static final bo6 f15471b;

    /* JADX INFO: renamed from: c */
    public static final bo6 f15472c;

    /* JADX INFO: renamed from: d */
    public static final bo6[] f15473d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ bo6[] f15474e;

    /* JADX INFO: renamed from: a */
    public final byte f15475a;

    /* JADX INFO: Fake field, exist only in values array */
    bo6 EF0;

    static {
        uo6 uo6Var = uo6.DOUBLE;
        bo6 bo6Var = new bo6("DOUBLE", 0, 0, 1, uo6Var);
        uo6 uo6Var2 = uo6.FLOAT;
        bo6 bo6Var2 = new bo6("FLOAT", 1, 1, 1, uo6Var2);
        uo6 uo6Var3 = uo6.LONG;
        bo6 bo6Var3 = new bo6("INT64", 2, 2, 1, uo6Var3);
        bo6 bo6Var4 = new bo6("UINT64", 3, 3, 1, uo6Var3);
        uo6 uo6Var4 = uo6.INT;
        bo6 bo6Var5 = new bo6("INT32", 4, 4, 1, uo6Var4);
        bo6 bo6Var6 = new bo6("FIXED64", 5, 5, 1, uo6Var3);
        bo6 bo6Var7 = new bo6("FIXED32", 6, 6, 1, uo6Var4);
        uo6 uo6Var5 = uo6.BOOLEAN;
        bo6 bo6Var8 = new bo6("BOOL", 7, 7, 1, uo6Var5);
        uo6 uo6Var6 = uo6.STRING;
        bo6 bo6Var9 = new bo6("STRING", 8, 8, 1, uo6Var6);
        uo6 uo6Var7 = uo6.MESSAGE;
        bo6 bo6Var10 = new bo6("MESSAGE", 9, 9, 1, uo6Var7);
        uo6 uo6Var8 = uo6.BYTE_STRING;
        bo6 bo6Var11 = new bo6("BYTES", 10, 10, 1, uo6Var8);
        bo6 bo6Var12 = new bo6("UINT32", 11, 11, 1, uo6Var4);
        uo6 uo6Var9 = uo6.ENUM;
        bo6 bo6Var13 = new bo6("ENUM", 12, 12, 1, uo6Var9);
        bo6 bo6Var14 = new bo6("SFIXED32", 13, 13, 1, uo6Var4);
        bo6 bo6Var15 = new bo6("SFIXED64", 14, 14, 1, uo6Var3);
        bo6 bo6Var16 = new bo6("SINT32", 15, 15, 1, uo6Var4);
        bo6 bo6Var17 = new bo6("SINT64", 16, 16, 1, uo6Var3);
        bo6 bo6Var18 = new bo6("GROUP", 17, 17, 1, uo6Var7);
        bo6 bo6Var19 = new bo6("DOUBLE_LIST", 18, 18, 2, uo6Var);
        bo6 bo6Var20 = new bo6("FLOAT_LIST", 19, 19, 2, uo6Var2);
        bo6 bo6Var21 = new bo6("INT64_LIST", 20, 20, 2, uo6Var3);
        bo6 bo6Var22 = new bo6("UINT64_LIST", 21, 21, 2, uo6Var3);
        bo6 bo6Var23 = new bo6("INT32_LIST", 22, 22, 2, uo6Var4);
        bo6 bo6Var24 = new bo6("FIXED64_LIST", 23, 23, 2, uo6Var3);
        bo6 bo6Var25 = new bo6("FIXED32_LIST", 24, 24, 2, uo6Var4);
        bo6 bo6Var26 = new bo6("BOOL_LIST", 25, 25, 2, uo6Var5);
        bo6 bo6Var27 = new bo6("STRING_LIST", 26, 26, 2, uo6Var6);
        bo6 bo6Var28 = new bo6("MESSAGE_LIST", 27, 27, 2, uo6Var7);
        bo6 bo6Var29 = new bo6("BYTES_LIST", 28, 28, 2, uo6Var8);
        bo6 bo6Var30 = new bo6("UINT32_LIST", 29, 29, 2, uo6Var4);
        bo6 bo6Var31 = new bo6("ENUM_LIST", 30, 30, 2, uo6Var9);
        bo6 bo6Var32 = new bo6("SFIXED32_LIST", 31, 31, 2, uo6Var4);
        bo6 bo6Var33 = new bo6("SFIXED64_LIST", 32, 32, 2, uo6Var3);
        bo6 bo6Var34 = new bo6("SINT32_LIST", 33, 33, 2, uo6Var4);
        bo6 bo6Var35 = new bo6("SINT64_LIST", 34, 34, 2, uo6Var3);
        bo6 bo6Var36 = new bo6("DOUBLE_LIST_PACKED", 35, 35, 3, uo6Var);
        f15471b = bo6Var36;
        bo6 bo6Var37 = new bo6("FLOAT_LIST_PACKED", 36, 36, 3, uo6Var2);
        bo6 bo6Var38 = new bo6("INT64_LIST_PACKED", 37, 37, 3, uo6Var3);
        bo6 bo6Var39 = new bo6("UINT64_LIST_PACKED", 38, 38, 3, uo6Var3);
        bo6 bo6Var40 = new bo6("INT32_LIST_PACKED", 39, 39, 3, uo6Var4);
        bo6 bo6Var41 = new bo6("FIXED64_LIST_PACKED", 40, 40, 3, uo6Var3);
        bo6 bo6Var42 = new bo6("FIXED32_LIST_PACKED", 41, 41, 3, uo6Var4);
        bo6 bo6Var43 = new bo6("BOOL_LIST_PACKED", 42, 42, 3, uo6Var5);
        bo6 bo6Var44 = new bo6("UINT32_LIST_PACKED", 43, 43, 3, uo6Var4);
        bo6 bo6Var45 = new bo6("ENUM_LIST_PACKED", 44, 44, 3, uo6Var9);
        bo6 bo6Var46 = new bo6("SFIXED32_LIST_PACKED", 45, 45, 3, uo6Var4);
        bo6 bo6Var47 = new bo6("SFIXED64_LIST_PACKED", 46, 46, 3, uo6Var3);
        bo6 bo6Var48 = new bo6("SINT32_LIST_PACKED", 47, 47, 3, uo6Var4);
        bo6 bo6Var49 = new bo6("SINT64_LIST_PACKED", 48, 48, 3, uo6Var3);
        f15472c = bo6Var49;
        f15474e = new bo6[]{bo6Var, bo6Var2, bo6Var3, bo6Var4, bo6Var5, bo6Var6, bo6Var7, bo6Var8, bo6Var9, bo6Var10, bo6Var11, bo6Var12, bo6Var13, bo6Var14, bo6Var15, bo6Var16, bo6Var17, bo6Var18, bo6Var19, bo6Var20, bo6Var21, bo6Var22, bo6Var23, bo6Var24, bo6Var25, bo6Var26, bo6Var27, bo6Var28, bo6Var29, bo6Var30, bo6Var31, bo6Var32, bo6Var33, bo6Var34, bo6Var35, bo6Var36, bo6Var37, bo6Var38, bo6Var39, bo6Var40, bo6Var41, bo6Var42, bo6Var43, bo6Var44, bo6Var45, bo6Var46, bo6Var47, bo6Var48, bo6Var49, new bo6("GROUP_LIST", 49, 49, 2, uo6Var7), new bo6("MAP", 50, 50, 4, uo6.VOID)};
        bo6[] bo6VarArrValues = values();
        f15473d = new bo6[bo6VarArrValues.length];
        for (bo6 bo6Var50 : bo6VarArrValues) {
            f15473d[bo6Var50.f15475a] = bo6Var50;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public bo6(String str, int i, int i2, int i3, uo6 uo6Var) {
        super(str, i);
        this.f15475a = i2;
        int i4 = i3 - 1;
        if (i4 == 1 || i4 == 3) {
            Class cls = uo6Var.f32050a;
        }
        if (i3 == 1) {
            uo6 uo6Var2 = uo6.VOID;
            uo6Var.ordinal();
        }
    }

    public static bo6[] values() {
        return (bo6[]) f15474e.clone();
    }
}
