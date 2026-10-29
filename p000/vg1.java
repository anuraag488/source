package p000;

import android.util.Log;
import java.lang.invoke.VarHandle;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vg1 implements le4, xm0 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ wg1 f32593a;

    @Override // p000.xm0
    /* JADX INFO: renamed from: h */
    public Object mo3681h(nr6 nr6Var) {
        boolean z;
        wg1 wg1Var = this.f32593a;
        if (nr6Var.m8826j()) {
            uj0 uj0Var = wg1Var.f33358c;
            synchronized (uj0Var) {
                uj0Var.f31905c = y62.m12936B(null);
            }
            hk0 hk0Var = uj0Var.f31904b;
            synchronized (hk0Var) {
                hk0Var.f20633a.deleteFile(hk0Var.f20634b);
            }
            wj0 wj0Var = (wj0) nr6Var.m8824h();
            z = true;
            if (wj0Var != null) {
                JSONArray jSONArray = wj0Var.f33419d;
                bg1 bg1Var = wg1Var.f33356a;
                if (bg1Var != null) {
                    try {
                        bg1Var.m3571c(wg1.m12301e(jSONArray));
                    } catch (JSONException e) {
                        Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e);
                    } catch (C1278w2 e2) {
                        Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", e2);
                    }
                }
                C1283w7 c1283w7 = wg1Var.f33364i;
                c1283w7.getClass();
                try {
                    C1232uu c1232uuM9606d = ((pq3) c1283w7.f33128d).m9606d(wj0Var);
                    for (tp0 tp0Var : (Set) c1283w7.f33126b) {
                        Executor executor = (Executor) c1283w7.f33129e;
                        qq3 qq3Var = new qq3((byte) 1);
                        qq3Var.f28692b = tp0Var;
                        qq3Var.f28693c = c1232uuM9606d;
                        VarHandle.storeStoreFence();
                        executor.execute(qq3Var);
                    }
                } catch (yg1 e3) {
                    Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscribers. Continuing to listen for changes.", e3);
                }
            } else {
                Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
            }
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // p000.le4
    /* JADX INFO: renamed from: n */
    public nr6 mo3146n(Object obj) {
        wg1 wg1Var = this.f32593a;
        nr6 nr6VarM11571b = wg1Var.f33358c.m11571b();
        nr6 nr6VarM11571b2 = wg1Var.f33359d.m11571b();
        nr6 nr6VarM12978k0 = y62.m12978k0(nr6VarM11571b, nr6VarM11571b2);
        Executor executor = wg1Var.f33357b;
        ck0 ck0Var = new ck0((byte) 3);
        ck0Var.f16074b = wg1Var;
        ck0Var.f16075c = nr6VarM11571b;
        ck0Var.f16076d = nr6VarM11571b2;
        VarHandle.storeStoreFence();
        return nr6VarM12978k0.m8822f(executor, ck0Var);
    }
}
