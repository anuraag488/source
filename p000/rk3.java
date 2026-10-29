package p000;

import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class rk3 extends d12 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f29374a = 1;

    /* JADX INFO: renamed from: b */
    public long f29375b;

    /* JADX INFO: renamed from: c */
    public Object f29376c;

    /* JADX INFO: renamed from: d */
    public k40 f29377d;

    public rk3(String str, long j, ak3 ak3Var) {
        this.f29376c = str;
        this.f29375b = j;
        this.f29377d = ak3Var;
    }

    @Override // p000.d12
    /* JADX INFO: renamed from: b */
    public final long mo4275b() {
        switch (this.f29374a) {
            case 0:
                break;
        }
        return this.f29375b;
    }

    @Override // p000.d12
    /* JADX INFO: renamed from: e */
    public final qr2 mo4276e() {
        switch (this.f29374a) {
            case 0:
                String str = (String) this.f29376c;
                if (str == null) {
                    return null;
                }
                Pattern pattern = qr2.f28726c;
                try {
                    return qq2.m10034r(str);
                } catch (IllegalArgumentException unused) {
                    return null;
                }
            default:
                return (qr2) this.f29376c;
        }
    }

    @Override // p000.d12
    /* JADX INFO: renamed from: j */
    public final k40 mo4278j() {
        switch (this.f29374a) {
            case 0:
                return (ak3) this.f29377d;
            default:
                return (w30) this.f29377d;
        }
    }

    public /* synthetic */ rk3() {
    }
}
