package p000;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yf6 implements Callable {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f35199a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ String f35200b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ ge6 f35201c;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        MessageDigest messageDigest;
        boolean z = this.f35199a;
        String str = this.f35200b;
        ge6 ge6Var = this.f35201c;
        String str2 = (z || !rk6.m10352b(str, ge6Var, true, false).f29196b) ? "not allowed" : "debug cert rejected";
        for (int i = 0; i < 2; i++) {
            try {
                messageDigest = MessageDigest.getInstance("SHA-256");
                if (messageDigest != null) {
                    y42.m12854a0(messageDigest);
                    StringBuilder sbM13625y = zi4.m13625y(str2, ": pkg=", str, ", sha256=", i20.m6590o(messageDigest.digest(ge6Var.f19760k)));
                    sbM13625y.append(", atk=");
                    sbM13625y.append(z);
                    sbM13625y.append(", ver=12451000.false");
                    return sbM13625y.toString();
                }
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        messageDigest = null;
        y42.m12854a0(messageDigest);
        StringBuilder sbM13625y2 = zi4.m13625y(str2, ": pkg=", str, ", sha256=", i20.m6590o(messageDigest.digest(ge6Var.f19760k)));
        sbM13625y2.append(", atk=");
        sbM13625y2.append(z);
        sbM13625y2.append(", ver=12451000.false");
        return sbM13625y2.toString();
    }
}
