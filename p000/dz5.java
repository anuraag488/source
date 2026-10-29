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
public final class dz5 {

    /* JADX INFO: renamed from: c */
    public static final dz5 f17537c;

    /* JADX INFO: renamed from: d */
    public static final dz5 f17538d;

    /* JADX INFO: renamed from: e */
    public static final dz5 f17539e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ dz5[] f17540f;

    /* JADX INFO: renamed from: a */
    public final gz5 f17541a;

    /* JADX INFO: renamed from: b */
    public final byte f17542b;

    /* JADX INFO: Fake field, exist only in values array */
    dz5 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    dz5 EF2;

    /* JADX INFO: Fake field, exist only in values array */
    dz5 EF0;

    static {
        dz5 dz5Var = new dz5("DOUBLE", 0, gz5.f20224d, 1);
        dz5 dz5Var2 = new dz5("FLOAT", 1, gz5.f20223c, 5);
        gz5 gz5Var = gz5.f20222b;
        dz5 dz5Var3 = new dz5("INT64", 2, gz5Var, 0);
        dz5 dz5Var4 = new dz5("UINT64", 3, gz5Var, 0);
        gz5 gz5Var2 = gz5.f20221a;
        dz5 dz5Var5 = new dz5("INT32", 4, gz5Var2, 0);
        dz5 dz5Var6 = new dz5("FIXED64", 5, gz5Var, 1);
        dz5 dz5Var7 = new dz5("FIXED32", 6, gz5Var2, 5);
        dz5 dz5Var8 = new dz5("BOOL", 7, gz5.f20225e, 0);
        dz5 dz5Var9 = new dz5("STRING", 8, gz5.f20226f, 2);
        f17537c = dz5Var9;
        gz5 gz5Var3 = gz5.f20229i;
        dz5 dz5Var10 = new dz5("GROUP", 9, gz5Var3, 3);
        f17538d = dz5Var10;
        dz5 dz5Var11 = new dz5("MESSAGE", 10, gz5Var3, 2);
        f17539e = dz5Var11;
        f17540f = new dz5[]{dz5Var, dz5Var2, dz5Var3, dz5Var4, dz5Var5, dz5Var6, dz5Var7, dz5Var8, dz5Var9, dz5Var10, dz5Var11, new dz5("BYTES", 11, gz5.f20227g, 2), new dz5("UINT32", 12, gz5Var2, 0), new dz5("ENUM", 13, gz5.f20228h, 0), new dz5("SFIXED32", 14, gz5Var2, 5), new dz5("SFIXED64", 15, gz5Var, 1), new dz5("SINT32", 16, gz5Var2, 0), new dz5("SINT64", 17, gz5Var, 0)};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public dz5(String str, int i, gz5 gz5Var, int i2) {
        super(str, i);
        this.f17541a = gz5Var;
        this.f17542b = i2;
    }

    public static dz5[] values() {
        return (dz5[]) f17540f.clone();
    }
}
