package p000;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import android.util.Base64;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Pattern;
import org.chromium.net.ApiVersion;
import org.chromium.net.ICronetEngineBuilder;
import org.chromium.net.VersionSafeProxyOptions;
import org.chromium.net.impl.ImplVersion;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class gr0 extends ICronetEngineBuilder {

    /* JADX INFO: renamed from: q */
    public static final Pattern f20058q = Pattern.compile("^[0-9\\.]*$");

    /* JADX INFO: renamed from: r */
    public static final int f20059r = r26.m10182a();

    /* JADX INFO: renamed from: a */
    public final dt0 f20060a;

    /* JADX INFO: renamed from: b */
    public final Context f20061b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f20062c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final ArrayList f20063d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public boolean f20064e;

    /* JADX INFO: renamed from: f */
    public String f20065f;

    /* JADX INFO: renamed from: g */
    public String f20066g;

    /* JADX INFO: renamed from: h */
    public boolean f20067h;

    /* JADX INFO: renamed from: i */
    public boolean f20068i;

    /* JADX INFO: renamed from: j */
    public boolean f20069j;

    /* JADX INFO: renamed from: k */
    public int f20070k;

    /* JADX INFO: renamed from: l */
    public long f20071l;

    /* JADX INFO: renamed from: m */
    public String f20072m;

    /* JADX INFO: renamed from: n */
    public boolean f20073n;

    /* JADX INFO: renamed from: o */
    public VersionSafeProxyOptions f20074o;

    /* JADX INFO: renamed from: p */
    public final nr0 f20075p;

    public gr0(Context context, nr0 nr0Var) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        Context applicationContext = context.getApplicationContext();
        this.f20061b = applicationContext;
        this.f20075p = nr0Var;
        this.f20060a = ks5.m7599F(applicationContext, nr0Var);
        boolean z = false;
        byte b = 0;
        int i = 0;
        byte b2 = 0;
        boolean z2 = true;
        try {
            this.f20067h = z2;
            this.f20068i = z2;
            this.f20069j = b2 == true ? 1 : 0;
            m6104c(i, 0L);
            this.f20073n = b == true ? 1 : 0;
            this.f20064e = z2;
        } finally {
            m6107f(jUptimeMillis, z, nr0Var);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m6102a(String str, Set set, boolean z, Date date) {
        Objects.requireNonNull(str, "The hostname cannot be null.");
        Objects.requireNonNull(set, "The set of SHA256 pins cannot be null.");
        Objects.requireNonNull(date, "The pin expiration date cannot be null.");
        if (f20058q.matcher(str).matches()) {
            C1077qn.m9987m(zi4.m13621u("Hostname ", str, " is illegal. A hostname should not consist of digits and/or dots only."));
            return;
        }
        if (str.length() > 253) {
            C1077qn.m9987m(zi4.m13621u("Hostname ", str, " is too long. The name of the host does not comply with RFC 1122 and RFC 1123."));
            return;
        }
        try {
            String strM8458a = mz1.m8458a(str);
            HashMap map = new HashMap();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                byte[] bArr = (byte[]) it.next();
                if (bArr == null || bArr.length != 32) {
                    C1077qn.m9987m("Public key pin is invalid");
                    return;
                }
                map.put(Base64.encodeToString(bArr, 0), bArr);
            }
            byte[][] bArr2 = (byte[][]) map.values().toArray(new byte[map.size()][]);
            er5 er5Var = new er5();
            er5Var.f18422a = strM8458a;
            er5Var.f18423b = bArr2;
            er5Var.f18424c = z;
            er5Var.f18425d = date;
            VarHandle.storeStoreFence();
            this.f20063d.add(er5Var);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(zi4.m13621u("Hostname ", str, " is illegal. The name of the host does not comply with RFC 1122 and RFC 1123."), e);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m6103b(int i, String str, int i2) {
        if (str.contains("/")) {
            C1077qn.m9987m("Illegal QUIC Hint Host: ".concat(str));
            return;
        }
        jr5 jr5Var = new jr5();
        jr5Var.f22546a = str;
        jr5Var.f22547b = i;
        jr5Var.f22548c = i2;
        VarHandle.storeStoreFence();
        this.f20062c.add(jr5Var);
    }

    /* JADX INFO: renamed from: c */
    public final void m6104c(int i, long j) {
        int i2;
        if (i == 0) {
            i2 = 1;
        } else if (i != 1) {
            i2 = 3;
            if (i != 2) {
                if (i != 3) {
                    C1077qn.m9987m("Unknown public builder cache mode");
                    return;
                }
                i2 = 2;
            }
        } else {
            i2 = 4;
        }
        if (sk5.m10840f(i2) == 1 && this.f20066g == null) {
            C1077qn.m9987m("Storage path must be set");
        } else {
            this.f20070k = i2;
            this.f20071l = j;
        }
    }

    /* JADX INFO: renamed from: d */
    public final String m6105d() {
        if (!this.f20067h) {
            return "";
        }
        ImplVersion.getCronetVersion();
        return this.f20061b.getPackageName() + " Cronet/155.0.8059.16";
    }

    /* JADX INFO: renamed from: e */
    public final kr0 m6106e() {
        int i;
        boolean z = this.f20064e;
        boolean z2 = this.f20067h;
        boolean z3 = this.f20068i;
        boolean z4 = this.f20069j;
        int iM4376u = d55.m4376u(this.f20070k);
        if (iM4376u != 0) {
            i = 3;
            if (iM4376u != 1) {
                if (iM4376u == 2) {
                    i = 2;
                } else {
                    if (iM4376u != 3) {
                        C1077qn.m9987m("Unknown internal builder cache mode");
                        return null;
                    }
                    i = 1;
                }
            }
        } else {
            i = 0;
        }
        String str = this.f20072m;
        boolean z5 = this.f20073n;
        long logCronetInitializationRef = getLogCronetInitializationRef();
        kr0 kr0Var = new kr0();
        kr0Var.f23342a = z;
        kr0Var.f23343b = z2;
        kr0Var.f23344c = z3;
        kr0Var.f23345d = z4;
        kr0Var.f23346e = i;
        kr0Var.f23347f = str;
        kr0Var.f23348g = z5;
        kr0Var.f23349h = logCronetInitializationRef;
        VarHandle.storeStoreFence();
        return kr0Var;
    }

    /* JADX INFO: renamed from: f */
    public final void m6107f(long j, boolean z, nr0 nr0Var) {
        dt0 dt0Var = this.f20060a;
        if (f20059r >= 30) {
            return;
        }
        lr0 lr0Var = new lr0();
        lr0Var.f24302e = Boolean.FALSE;
        try {
            lr0Var.f24299b = 2;
            lr0Var.f24305h = Process.myUid();
            lr0Var.f24304g = new pr0(ImplVersion.getCronetVersion());
            lr0Var.f24301d = nr0Var;
            lr0Var.f24303f = new pr0(ApiVersion.getCronetVersion());
            lr0Var.f24298a = getLogCronetInitializationRef();
            lr0Var.f24302e = Boolean.valueOf(z);
        } finally {
            lr0Var.f24300c = (int) (SystemClock.uptimeMillis() - j);
            dt0Var.mo4108H(lr0Var);
        }
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final String getDefaultUserAgent() {
        return zc6.m13515L(this.f20061b, this.f20075p, ImplVersion.getCronetVersion());
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final Set getSupportedConfigOptions() {
        HashSet hashSet = new HashSet();
        hashSet.add(4);
        return Collections.unmodifiableSet(hashSet);
    }
}
