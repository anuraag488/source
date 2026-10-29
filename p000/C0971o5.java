package p000;

/* JADX INFO: renamed from: o5 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0971o5 implements wp1 {

    /* JADX INFO: renamed from: b */
    public static final C0971o5 f26339b = new C0971o5(0);

    /* JADX INFO: renamed from: c */
    public static final C0971o5 f26340c = new C0971o5(1);

    /* JADX INFO: renamed from: d */
    public static final C0971o5 f26341d = new C0971o5(2);

    /* JADX INFO: renamed from: e */
    public static final C0971o5 f26342e = new C0971o5(3);

    /* JADX INFO: renamed from: f */
    public static final C0971o5 f26343f = new C0971o5(4);

    /* JADX INFO: renamed from: g */
    public static final C0971o5 f26344g = new C0971o5(5);

    /* JADX INFO: renamed from: h */
    public static final C0971o5 f26345h = new C0971o5(6);

    /* JADX INFO: renamed from: i */
    public static final C0971o5 f26346i = new C0971o5(7);

    /* JADX INFO: renamed from: j */
    public static final C0971o5 f26347j = new C0971o5(8);

    /* JADX INFO: renamed from: k */
    public static final C0971o5 f26348k = new C0971o5(9);

    /* JADX INFO: renamed from: l */
    public static final C0971o5 f26349l = new C0971o5(10);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f26350a;

    public /* synthetic */ C0971o5(byte b) {
        this.f26350a = b;
    }

    @Override // p000.wp1
    public final Object invoke() {
        switch (this.f26350a) {
            case 0:
                return oh6.m9109o("essentials.ads.AdBannerSize", EnumC1059q5.values());
            case 1:
                return ks5.m7618s(fd4.f18924a);
            case 2:
                return pb0.m9462a(zy5.m13869d(1308617531));
            case 3:
                return pb0.m9462a(pb0.f27495b);
            case 4:
                return oh6.m9109o("essentials.TrialMode", xp4.values());
            case 5:
                throw new IllegalStateException("DynamicMaterialTheme not initialized");
            case 6:
                return ks5.m7618s(oh6.m9109o("essentials.control.MediaAction", lr2.values()));
            case 7:
                return a10.f32a;
            case 8:
                return a10.f32a;
            case 9:
                return ks5.m7618s(ea3.Companion.serializer());
            default:
                return a10.f32a;
        }
    }
}
