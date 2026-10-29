package p000;

import ads_mobile_sdk.EnumC0250nc;
import ads_mobile_sdk.lr2;
import ads_mobile_sdk.yw1;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import java.lang.invoke.VarHandle;
import java.security.KeyFactory;
import java.security.Provider;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class r50 implements m50, qo0, w81, wg3, ai3, q54, InterfaceC0976oa, ja0, t65, pe5 {

    /* JADX INFO: renamed from: b */
    public static volatile r50 f29018b;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f29019a;

    public /* synthetic */ r50(byte b) {
        this.f29019a = b;
    }

    /* JADX INFO: renamed from: c */
    public static EnumC0250nc m10204c(String str) {
        return str.toLowerCase(Locale.ROOT).equals("app_open_ad") ? EnumC0250nc.f7635d : (EnumC0250nc) Enum.valueOf(EnumC0250nc.class, str);
    }

    /* JADX INFO: renamed from: f */
    public static yw1 m10205f(Object obj, Object obj2) {
        yw1 yw1VarM2767f = (yw1) obj;
        yw1 yw1Var = (yw1) obj2;
        if (!yw1Var.isEmpty()) {
            if (!yw1VarM2767f.m2765d()) {
                yw1VarM2767f = yw1VarM2767f.m2767f();
            }
            yw1VarM2767f.m2764a(yw1Var);
        }
        return yw1VarM2767f;
    }

    /* JADX INFO: renamed from: g */
    public static Typeface m10206g(String str, xm1 xm1Var, int i) {
        if (i == 0 && z62.m13387o(xm1Var, xm1.f34413f) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        if (i == 0 && z62.m13387o(xm1Var, xm1.f34416i) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT_BOLD;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), xm1Var.f34418a, i == 1);
    }

    @Override // p000.t65
    /* JADX INFO: renamed from: a */
    public Object mo5605a(int i) {
        lr2 lr2VarM1615a = lr2.m1615a(i);
        return lr2VarM1615a == null ? lr2.f6973b : lr2VarM1615a;
    }

    @Override // p000.m50
    /* JADX INFO: renamed from: b */
    public byte[] mo6669b(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    @Override // p000.w81
    /* JADX INFO: renamed from: d */
    public Object mo5607d(String str, Provider provider) {
        return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
    }

    @Override // p000.pe5
    /* JADX INFO: renamed from: e */
    public byte[] mo9502e(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    @Override // p000.ai3
    public Object get() {
        r50 r50Var = new r50((byte) 22);
        HashMap map = new HashMap();
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            xy4.m12782k("Null flags");
            return null;
        }
        C1307wu c1307wu = new C1307wu();
        c1307wu.f33726a = 30000L;
        c1307wu.f33727b = 86400000L;
        c1307wu.f33728c = set;
        VarHandle.storeStoreFence();
        map.put(ag3.f14485a, c1307wu);
        if (set == null) {
            xy4.m12782k("Null flags");
            return null;
        }
        C1307wu c1307wu2 = new C1307wu();
        c1307wu2.f33726a = 1000L;
        c1307wu2.f33727b = 86400000L;
        c1307wu2.f33728c = set;
        VarHandle.storeStoreFence();
        map.put(ag3.f14487c, c1307wu2);
        if (set == null) {
            xy4.m12782k("Null flags");
            return null;
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(cw3.f16536b)));
        if (setUnmodifiableSet == null) {
            xy4.m12782k("Null flags");
            return null;
        }
        C1307wu c1307wu3 = new C1307wu();
        c1307wu3.f33726a = 86400000L;
        c1307wu3.f33727b = 86400000L;
        c1307wu3.f33728c = setUnmodifiableSet;
        VarHandle.storeStoreFence();
        map.put(ag3.f14486b, c1307wu3);
        if (map.keySet().size() < ag3.values().length) {
            C1077qn.m9989o("Not all priorities have been configured");
            return null;
        }
        new HashMap();
        C1269vu c1269vu = new C1269vu();
        c1269vu.f32873a = r50Var;
        c1269vu.f32874b = map;
        VarHandle.storeStoreFence();
        return c1269vu;
    }

    @Override // p000.wg3
    /* JADX INFO: renamed from: h */
    public void mo10207h(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    @Override // p000.ja0
    /* JADX INFO: renamed from: j */
    public long mo5609j() {
        return System.currentTimeMillis();
    }

    @Override // p000.InterfaceC0976oa
    /* JADX INFO: renamed from: k */
    public void mo3143k(Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
    }

    public String toString() {
        switch (this.f29019a) {
            case 18:
                return "SharingStarted.Eagerly";
            default:
                return super.toString();
        }
    }

    @Override // p000.q54
    /* JADX INFO: renamed from: a */
    public si1 mo5606a(je4 je4Var) {
        return qq2.m10033q(j54.f22029a);
    }
}
