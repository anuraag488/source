package p000;

import android.text.TextUtils;
import java.io.IOException;
import java.util.Iterator;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qg1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f28450a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ rg1 f28451b;

    public /* synthetic */ qg1(byte b) {
        this.f28450a = b;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        C1084qu c1084quM13315M;
        C1084qu c1084quM10335h;
        byte b = this.f28450a;
        rg1 rg1Var = this.f28451b;
        switch (b) {
            case 0:
                rg1Var.m10329a();
                return;
            case 1:
                rg1Var.m10329a();
                return;
            default:
                Object obj = rg1.f29235m;
                synchronized (obj) {
                    try {
                        hg1 hg1Var = rg1Var.f29236a;
                        hg1Var.m6388a();
                        nh3 nh3VarM8732d = nh3.m8732d(hg1Var.f20545a);
                        try {
                            c1084quM13315M = rg1Var.f29238c.m13315M();
                            if (nh3VarM8732d != null) {
                                nh3VarM8732d.m8743J();
                            }
                        } catch (Throwable th) {
                            if (nh3VarM8732d != null) {
                                nh3VarM8732d.m8743J();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                try {
                    int i = c1084quM13315M.f28795b;
                    boolean z = false;
                    if (i == 5) {
                        c1084quM10335h = rg1Var.m10335h(c1084quM13315M);
                    } else {
                        if (i == 3) {
                            c1084quM10335h = rg1Var.m10335h(c1084quM13315M);
                        } else if (!rg1Var.f29239d.m4784b(c1084quM13315M)) {
                            return;
                        } else {
                            c1084quM10335h = rg1Var.m10330b(c1084quM13315M);
                        }
                    }
                    synchronized (obj) {
                        try {
                            hg1 hg1Var2 = rg1Var.f29236a;
                            hg1Var2.m6388a();
                            nh3 nh3VarM8732d2 = nh3.m8732d(hg1Var2.f20545a);
                            try {
                                rg1Var.f29238c.m13310H(c1084quM10335h);
                                if (nh3VarM8732d2 != null) {
                                    nh3VarM8732d2.m8743J();
                                }
                            } catch (Throwable th3) {
                                if (nh3VarM8732d2 != null) {
                                    nh3VarM8732d2.m8743J();
                                }
                                throw th3;
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    synchronized (rg1Var) {
                        try {
                            boolean z2 = c1084quM10335h.f28795b == 4;
                            String str = c1084quM10335h.f28794a;
                            if (z2 && !TextUtils.isEmpty(str)) {
                                if (TextUtils.equals(c1084quM13315M.f28794a, str)) {
                                    z = !(c1084quM13315M.f28795b == 4);
                                } else {
                                    z = true;
                                }
                            }
                            if (z) {
                                Iterator it = rg1Var.f29246k.iterator();
                                if (it.hasNext()) {
                                    if (it.next() != null) {
                                        throw new ClassCastException();
                                    }
                                    throw null;
                                }
                            }
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    }
                    if (c1084quM10335h.f28795b == 4) {
                        String str2 = c1084quM10335h.f28794a;
                        synchronized (rg1Var) {
                            rg1Var.f29245j = str2;
                        }
                    }
                    int i2 = c1084quM10335h.f28795b;
                    if (i2 == 5) {
                        rg1Var.m10336i(new tg1());
                        return;
                    } else if (i2 == 2 || i2 == 1) {
                        rg1Var.m10336i(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                        return;
                    } else {
                        rg1Var.m10337j(c1084quM10335h);
                        return;
                    }
                } catch (tg1 e) {
                    rg1Var.m10336i(e);
                    return;
                }
        }
    }
}
