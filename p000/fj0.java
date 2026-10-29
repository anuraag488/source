package p000;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import java.lang.invoke.VarHandle;
import java.lang.reflect.Method;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fj0 implements wp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f19021a;

    public /* synthetic */ fj0(byte b) {
        this.f19021a = b;
    }

    @Override // p000.wp1
    public final Object invoke() {
        Class<?> returnType;
        byte b = this.f19021a;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                ij0.m6812b("LocalTextToolbar");
                throw null;
            case 1:
                qi0.m9890b("Unexpected call to default provider");
                throw new gf0();
            case 2:
                return ln0.f24192c;
            case 3:
                return dn0.f17203a;
            case 4:
                return new da2((byte) 12);
            case 5:
                int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
                if (iAvailableProcessors < 3) {
                    iAvailableProcessors = 3;
                }
                return Integer.valueOf(iAvailableProcessors);
            case 6:
                return Boolean.TRUE;
            case 7:
                return Collections.singletonList(new kr3(as4.f14842a));
            case 8:
                e73.f17866a.getClass();
                return o85.f26452l;
            case 9:
                return null;
            case 10:
                xg0 xg0Var = new xg0((byte) 29);
                VarHandle.storeStoreFence();
                return Collections.singletonList(new kr3(new pg0(-2029500499, true, xg0Var)));
            case 11:
                return xp4.f34521b;
            case 12:
                return oh6.m9109o("essentials.FeatureStyle", fe1.values());
            case 13:
                return oh6.m9109o("essentials.FeaturePaletteStyle", qd1.values());
            case 14:
                return k43.m7398w(Boolean.FALSE);
            case 15:
                return true;
            case 16:
                return fm1.f19117a;
            case 17:
                try {
                    Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (Throwable unused) {
                    return null;
                }
            case 18:
                try {
                    Method method = (Method) uo1.f32023d.getValue();
                    if (method == null || (returnType = method.getReturnType()) == null) {
                        return null;
                    }
                    Class cls = Integer.TYPE;
                    return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
                } catch (Throwable unused2) {
                    return null;
                }
            case 19:
                return null;
            case 20:
                throw new IllegalStateException("CompositionLocal LocalHostDefaultProvider not present");
            case 21:
                return new h33(new g33());
            case 22:
                return null;
            case 23:
                kj0 kj0Var = n22.f25413a;
                return tv0.f31465a;
            case 24:
                return null;
            case 25:
                return p11.m9350a(48.0f);
            case 26:
            case 27:
                return ju4Var;
            case 28:
                return jb2.f22151b;
            default:
                return ta2.f31037b;
        }
    }
}
