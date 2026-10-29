package p000;

import android.content.Context;
import java.lang.invoke.VarHandle;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class mp4 {

    /* JADX INFO: renamed from: e */
    public static volatile xs0 f25114e;

    /* JADX INFO: renamed from: a */
    public ja0 f25115a;

    /* JADX INFO: renamed from: b */
    public ja0 f25116b;

    /* JADX INFO: renamed from: c */
    public qw0 f25117c;

    /* JADX INFO: renamed from: d */
    public wo5 f25118d;

    /* JADX INFO: renamed from: a */
    public static mp4 m8366a() {
        xs0 xs0Var = f25114e;
        if (xs0Var != null) {
            return (mp4) xs0Var.f34580f.get();
        }
        C1077qn.m9989o("Not initialized!");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static void m8367b(Context context) {
        if (f25114e == null) {
            synchronized (mp4.class) {
                try {
                    if (f25114e == null) {
                        C0572de c0572de = new C0572de();
                        context.getClass();
                        c0572de.f16997a = context;
                        f25114e = c0572de.m4489b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final lp4 m8368c(v50 v50Var) {
        byte[] bytes;
        Set setUnmodifiableSet = v50Var instanceof v50 ? Collections.unmodifiableSet(v50.f32410d) : Collections.singleton(j81.m7046a("proto"));
        jp0 jp0VarM4741a = C0588dv.m4741a();
        v50Var.getClass();
        jp0VarM4741a.f22482c = "cct";
        String str = v50Var.f32413a;
        String str2 = v50Var.f32414b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = c75.m3879k("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        jp0VarM4741a.f22481b = bytes;
        C0588dv c0588dvM7241j = jp0VarM4741a.m7241j();
        lp4 lp4Var = new lp4();
        lp4Var.f24269a = setUnmodifiableSet;
        lp4Var.f24270b = c0588dvM7241j;
        lp4Var.f24271c = this;
        VarHandle.storeStoreFence();
        return lp4Var;
    }
}
