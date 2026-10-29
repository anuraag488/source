package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class dc6 {

    /* JADX INFO: renamed from: a */
    public mq5 f16984a;

    /* JADX INFO: renamed from: b */
    public wo5 f16985b;

    /* JADX INFO: renamed from: c */
    public gu5 f16986c;

    /* JADX INFO: renamed from: d */
    public Object f16987d;

    /* JADX INFO: renamed from: e */
    public Object f16988e;

    /* JADX INFO: renamed from: f */
    public fx5 f16989f;

    /* JADX INFO: renamed from: g */
    public boolean f16990g;

    /* JADX INFO: renamed from: h */
    public boolean f16991h;

    /* JADX INFO: renamed from: i */
    public f70 f16992i;

    /* JADX INFO: renamed from: a */
    public final boolean m4441a() {
        mq5 mq5Var = this.f16984a;
        if (!mq5Var.f25152b.getBoolean("is_pub_misconfigured", false)) {
            int i = !m4443c() ? 0 : mq5Var.f25152b.getInt("consent_status", 0);
            if (i != 1 && i != 3) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final int m4442b() {
        if (!m4443c()) {
            return 1;
        }
        String string = this.f16984a.f25152b.getString("privacy_options_requirement_status", "UNKNOWN");
        if (string == null) {
            xy4.m12782k("Name is null");
        } else {
            if (string.equals("UNKNOWN")) {
                return 1;
            }
            if (string.equals("NOT_REQUIRED")) {
                return 2;
            }
            if (string.equals("REQUIRED")) {
                return 3;
            }
            C1077qn.m9987m("No enum constant com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus.".concat(string));
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m4443c() {
        boolean z;
        synchronized (this.f16987d) {
            z = this.f16990g;
        }
        return z;
    }
}
