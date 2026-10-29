package p000;

import ads_mobile_sdk.C0313rh;
import java.lang.invoke.VarHandle;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.TimeoutException;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class mf3 implements jf3 {

    /* JADX INFO: renamed from: a */
    public byte f24858a;

    /* JADX INFO: renamed from: b */
    public Object f24859b;

    /* JADX INFO: renamed from: c */
    public Object f24860c;

    /* JADX INFO: renamed from: d */
    public Object f24861d;

    public mf3(String str, SecretKeySpec secretKeySpec) throws GeneralSecurityException {
        lf3 lf3Var = new lf3();
        lf3Var.f24000a = this;
        VarHandle.storeStoreFence();
        this.f24859b = lf3Var;
        if (!zi4.m13604d(2)) {
            xy4.m12788q("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
            throw null;
        }
        this.f24860c = str;
        this.f24861d = secretKeySpec;
        if (secretKeySpec.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        switch (str) {
            case "HMACSHA1":
                this.f24858a = (byte) 20;
                break;
            case "HMACSHA224":
                this.f24858a = (byte) 28;
                break;
            case "HMACSHA256":
                this.f24858a = (byte) 32;
                break;
            case "HMACSHA384":
                this.f24858a = (byte) 48;
                break;
            case "HMACSHA512":
                this.f24858a = (byte) 64;
                break;
            default:
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
        }
        lf3Var.get();
    }

    /* JADX INFO: renamed from: a */
    public void m8295a(Throwable th) {
        boolean z = th instanceof TimeoutException;
        ez5 ez5Var = (ez5) this.f24861d;
        if (z) {
            ez5Var.m5428O(C0313rh.f10758U0, 28, rz5.f29776s);
            qv5.m10141i("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th);
        } else {
            ez5Var.m5428O(95, 28, rz5.f29776s);
            qv5.m10141i("BillingClientTesting", "An error occurred while retrieving billing override.", th);
        }
        ((Runnable) this.f24860c).run();
    }
}
