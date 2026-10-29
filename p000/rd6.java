package p000;

import android.content.Context;
import android.os.Binder;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;
import java.lang.invoke.VarHandle;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class rd6 {

    /* JADX INFO: renamed from: e */
    public static rd6 f29193e;

    /* JADX INFO: renamed from: f */
    public static final rd6 f29194f = new rd6(null, true, null);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f29195a;

    /* JADX INFO: renamed from: b */
    public boolean f29196b;

    /* JADX INFO: renamed from: c */
    public Object f29197c;

    /* JADX INFO: renamed from: d */
    public Object f29198d;

    public rd6(String str, boolean z, Exception exc) {
        this.f29195a = (byte) 1;
        this.f29196b = z;
        this.f29197c = str;
        this.f29198d = exc;
    }

    /* JADX INFO: renamed from: f */
    public static rd6 m10299f(Context context) {
        rd6 rd6Var;
        synchronized (rd6.class) {
            try {
                rd6 rd6Var2 = f29193e;
                if (rd6Var2 == null) {
                    byte b = 0;
                    if (d24.m4312m(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                        rd6Var2 = new rd6(b);
                        rd6Var2.f29196b = false;
                        rd6Var2.f29197c = context;
                        rd6Var2.f29198d = new pd6(null);
                    } else {
                        rd6Var2 = new rd6(b);
                        rd6Var2.f29196b = false;
                        rd6Var2.f29197c = null;
                        rd6Var2.f29198d = null;
                    }
                    VarHandle.storeStoreFence();
                    f29193e = rd6Var2;
                }
                if (((pd6) rd6Var2.f29198d) != null && !rd6Var2.f29196b) {
                    try {
                        context.getContentResolver().registerContentObserver(qc6.f28388a, true, (pd6) f29193e.f29198d);
                        rd6 rd6Var3 = f29193e;
                        rd6Var3.getClass();
                        rd6Var3.f29196b = true;
                    } catch (SecurityException e) {
                        Log.e("GservicesLoader", "Unable to register Gservices content observer", e);
                    }
                }
                rd6Var = f29193e;
                rd6Var.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
        return rd6Var;
    }

    /* JADX INFO: renamed from: j */
    public static rd6 m10300j(String str) {
        return new rd6(str, false, null);
    }

    /* JADX INFO: renamed from: k */
    public static rd6 m10301k(String str, Exception exc) {
        return new rd6(str, false, exc);
    }

    /* JADX INFO: renamed from: a */
    public boolean m10302a(long j) {
        Object obj;
        ArrayList arrayList = (ArrayList) ((nh3) this.f29198d).f25810b;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            if (c20.m3818m(((nc3) obj).f25673a, j)) {
                break;
            }
            i++;
        }
        nc3 nc3Var = (nc3) obj;
        if (nc3Var != null) {
            return nc3Var.f25680h;
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public vr0 m10303b() {
        xa0 xa0Var = (xa0) this.f29198d;
        int i = xa0Var.f34092b;
        int i2 = xa0Var.f34093c;
        if (i < i2) {
            return vr0.f32806b;
        }
        return i > i2 ? vr0.f32805a : vr0.f32807c;
    }

    /* JADX INFO: renamed from: c */
    public void m10304c() {
        if (this.f29196b) {
            ((pk4) this.f29198d).m9552n((ql4) this.f29197c);
        }
    }

    /* JADX INFO: renamed from: d */
    public long m10305d(xk4 xk4Var, long j, boolean z, ds3 ds3Var) {
        pk4 pk4Var = (pk4) this.f29198d;
        long jM9560v = pk4Var.m9560v(xk4Var, j, z, false, ds3Var, false, null);
        if (!ql4.m9898b(jM9560v, (ql4) this.f29197c)) {
            this.f29196b = false;
        }
        pk4Var.m9556r(ql4.m9900d(jM9560v) ? wu1.f33743c : wu1.f33742b);
        return jM9560v;
    }

    /* JADX INFO: renamed from: e */
    public String mo10306e() {
        return (String) this.f29197c;
    }

    /* JADX INFO: renamed from: g */
    public void m10307g(sn6 sn6Var) {
        synchronized (this.f29197c) {
            try {
                ArrayDeque arrayDeque = (ArrayDeque) this.f29198d;
                if (arrayDeque == null) {
                    arrayDeque = new ArrayDeque();
                    this.f29198d = arrayDeque;
                }
                arrayDeque.add(sn6Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0055 A[Catch: all -> 0x0016, TryCatch #1 {all -> 0x0016, blocks: (B:9:0x0010, B:11:0x0014, B:18:0x001e, B:20:0x0022, B:33:0x0055, B:34:0x0057, B:23:0x0030, B:25:0x0036, B:29:0x0043, B:31:0x0051), top: B:58:0x0010, inners: #0 }] */
    /* JADX INFO: renamed from: h */
    public String m10308h(String str) {
        Object objM13119q;
        Context context = (Context) this.f29197c;
        if (context != null) {
            boolean z = true;
            if (!zc6.f35985c) {
                synchronized (zc6.class) {
                    try {
                        if (!zc6.f35985c) {
                            int i = 1;
                            while (true) {
                                boolean z2 = false;
                                if (i <= 2) {
                                    UserManager userManager = zc6.f35984b;
                                    if (userManager == null) {
                                        userManager = (UserManager) context.getSystemService(UserManager.class);
                                        zc6.f35984b = userManager;
                                    }
                                    if (userManager == null) {
                                        z2 = true;
                                    } else {
                                        try {
                                            if (userManager.isUserUnlocked() || !userManager.isUserRunning(Process.myUserHandle())) {
                                                z2 = true;
                                            }
                                        } catch (NullPointerException e) {
                                            Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e);
                                            zc6.f35984b = null;
                                            i++;
                                        }
                                    }
                                    if (z2) {
                                        zc6.f35985c = true;
                                    }
                                    z = z2;
                                }
                                if (z2) {
                                    zc6.f35984b = null;
                                }
                                if (z2) {
                                    zc6.f35985c = true;
                                }
                                z = z2;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (z) {
                try {
                    yg3 yg3Var = new yg3((byte) 21);
                    yg3Var.f35215b = this;
                    yg3Var.f35216c = str;
                    VarHandle.storeStoreFence();
                    try {
                        objM13119q = yg3Var.m13119q();
                    } catch (SecurityException unused) {
                        long jClearCallingIdentity = Binder.clearCallingIdentity();
                        try {
                            objM13119q = yg3Var.m13119q();
                        } finally {
                            Binder.restoreCallingIdentity(jClearCallingIdentity);
                        }
                    }
                    return (String) objM13119q;
                } catch (IllegalStateException | NullPointerException | SecurityException e2) {
                    Log.e("GservicesLoader", "Unable to read GServices for: ".concat(str), e2);
                    return null;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public void m10309i(nr6 nr6Var) {
        sn6 sn6Var;
        synchronized (this.f29197c) {
            if (((ArrayDeque) this.f29198d) != null && !this.f29196b) {
                this.f29196b = true;
                while (true) {
                    synchronized (this.f29197c) {
                        try {
                            sn6Var = (sn6) ((ArrayDeque) this.f29198d).poll();
                            if (sn6Var == null) {
                                this.f29196b = false;
                                return;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    sn6Var.mo139a(nr6Var);
                }
            }
        }
    }

    public String toString() {
        switch (this.f29195a) {
            case 3:
                return "SingleSelectionLayout(isStartHandle=" + this.f29196b + ", crossed=" + m10303b() + ", info=\n\t" + ((xa0) this.f29198d) + ")";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ rd6(byte b) {
        this.f29195a = b;
    }
}
