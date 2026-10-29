package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class kz5 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f23653a = 0;

    static {
        int i = nz5.f26226vp;
    }

    /* JADX INFO: renamed from: a */
    public static String m7756a(Exception exc) {
        if (exc == null) {
            return null;
        }
        try {
            String simpleName = exc.getClass().getSimpleName();
            String message = exc.getMessage();
            if (message == null) {
                message = "";
            }
            String str = simpleName + ":" + message;
            int i = qv5.f28836a;
            return str.length() > 40 ? str.substring(0, 40) : str;
        } catch (Throwable th) {
            qv5.m10141i("BillingLogger", "Unable to get truncated exception info", th);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static yc6 m7757b(int i, int i2, f00 f00Var, String str, xd6 xd6Var) {
        try {
            id6 id6VarM9048r = od6.m9048r();
            int i3 = f00Var.f18622a;
            id6VarM9048r.m8971b();
            od6.m9047q((od6) id6VarM9048r.f26373b, i3);
            String str2 = f00Var.f18624c;
            id6VarM9048r.m8971b();
            od6.m9050t((od6) id6VarM9048r.f26373b, str2);
            int i4 = f00Var.f18623b;
            if (i4 != 0) {
                id6VarM9048r.m8971b();
                od6.m9052v((od6) id6VarM9048r.f26373b, i4);
            }
            if (i != 0) {
                id6VarM9048r.m8971b();
                od6.m9053w((od6) id6VarM9048r.f26373b, i);
            }
            if (str != null) {
                id6VarM9048r.m8971b();
                od6.m9049s((od6) id6VarM9048r.f26373b, str);
            }
            uc6 uc6VarM13092t = yc6.m13092t();
            uc6VarM13092t.m11533c(id6VarM9048r);
            uc6VarM13092t.m8971b();
            yc6.m13091s((yc6) uc6VarM13092t.f26373b, i2);
            if (!xd6Var.equals(xd6.f34175b)) {
                uc6VarM13092t.m8971b();
                yc6.m13094w((yc6) uc6VarM13092t.f26373b, xd6Var);
            }
            return (yc6) uc6VarM13092t.m8970a();
        } catch (Throwable th) {
            qv5.m10141i("BillingLogger", "Unable to create logging payload", th);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static fd6 m7758c(int i, xd6 xd6Var) {
        try {
            bd6 bd6VarM5694r = fd6.m5694r();
            bd6VarM5694r.m8971b();
            fd6.m5693q((fd6) bd6VarM5694r.f26373b, i);
            if (!xd6Var.equals(xd6.f34175b)) {
                bd6VarM5694r.m8971b();
                fd6.m5695t((fd6) bd6VarM5694r.f26373b, xd6Var);
            }
            return (fd6) bd6VarM5694r.m8970a();
        } catch (Exception e) {
            qv5.m10141i("BillingLogger", "Unable to create logging payload", e);
            return null;
        }
    }
}
