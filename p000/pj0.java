package p000;

import android.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pj0 implements xm0 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ rj0 f27648a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ nr6 f27649b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ nr6 f27650c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ long f27651d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ int f27652e;

    @Override // p000.xm0
    /* JADX INFO: renamed from: h */
    public final Object mo3681h(nr6 nr6Var) throws JSONException {
        Boolean boolValueOf;
        rj0 rj0Var = this.f27648a;
        nr6 nr6Var2 = this.f27649b;
        nr6 nr6Var3 = this.f27650c;
        long j = this.f27651d;
        int i = this.f27652e;
        rj0Var.getClass();
        if (!nr6Var2.m8826j()) {
            return y62.m12935A(new xg1("Failed to auto-fetch config update.", nr6Var2.m8823g()));
        }
        if (!nr6Var3.m8826j()) {
            return y62.m12935A(new xg1("Failed to get activated config for auto-fetch", nr6Var3.m8823g()));
        }
        zj0 zj0Var = (zj0) nr6Var2.m8824h();
        wj0 wj0VarM11901a = (wj0) nr6Var3.m8824h();
        wj0 wj0Var = zj0Var.f36144b;
        if (wj0Var != null) {
            boolValueOf = Boolean.valueOf(wj0Var.f33421f >= j);
        } else {
            boolValueOf = Boolean.valueOf(zj0Var.f36143a == 1);
        }
        if (!boolValueOf.booleanValue()) {
            Log.d("FirebaseRemoteConfig", "Fetched template version is the same as SDK's current version. Retrying fetch.");
            rj0Var.m10339a(i, j);
            return y62.m12936B(null);
        }
        if (zj0Var.f36144b == null) {
            Log.d("FirebaseRemoteConfig", "The fetch succeeded, but the backend had no updates.");
            return y62.m12936B(null);
        }
        if (wj0VarM11901a == null) {
            wj0VarM11901a = wj0.m12309d().m11901a();
        }
        wj0 wj0Var2 = zj0Var.f36144b;
        JSONObject jSONObject = wj0VarM11901a.f33420e;
        JSONObject jSONObject2 = wj0Var2.f33416a;
        JSONObject jSONObject3 = wj0Var2.f33417b;
        JSONObject jSONObject4 = wj0Var2.f33420e;
        JSONObject jSONObject5 = wj0.m12308a(new JSONObject(jSONObject2.toString())).f33417b;
        HashMap mapM12311c = wj0VarM11901a.m12311c();
        HashMap mapM12311c2 = wj0Var2.m12311c();
        HashMap mapM12310b = wj0VarM11901a.m12310b();
        HashMap mapM12310b2 = wj0Var2.m12310b();
        HashSet hashSet = new HashSet();
        JSONObject jSONObject6 = wj0VarM11901a.f33417b;
        Iterator<String> itKeys = jSONObject6.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!jSONObject3.has(next)) {
                hashSet.add(next);
            } else if (!jSONObject6.get(next).equals(jSONObject3.get(next))) {
                hashSet.add(next);
            } else if ((jSONObject.has(next) && !jSONObject4.has(next)) || (!jSONObject.has(next) && jSONObject4.has(next))) {
                hashSet.add(next);
            } else if (jSONObject.has(next) && jSONObject4.has(next) && !jSONObject.getJSONObject(next).toString().equals(jSONObject4.getJSONObject(next).toString())) {
                hashSet.add(next);
            } else if (mapM12311c.containsKey(next) != mapM12311c2.containsKey(next)) {
                hashSet.add(next);
            } else if (mapM12311c.containsKey(next) && mapM12311c2.containsKey(next) && !((Map) mapM12311c.get(next)).equals(mapM12311c2.get(next))) {
                hashSet.add(next);
            } else if (mapM12310b.containsKey(next) != mapM12310b2.containsKey(next)) {
                hashSet.add(next);
            } else if (mapM12310b2.containsKey(next) && mapM12310b.containsKey(next) && !((JSONObject) mapM12310b2.get(next)).toString().equals(((JSONObject) mapM12310b.get(next)).toString())) {
                hashSet.add(next);
            } else {
                jSONObject5.remove(next);
            }
        }
        Iterator<String> itKeys2 = jSONObject5.keys();
        while (itKeys2.hasNext()) {
            hashSet.add(itKeys2.next());
        }
        if (hashSet.isEmpty()) {
            Log.d("FirebaseRemoteConfig", "Config was fetched, but no params changed.");
            return y62.m12936B(null);
        }
        synchronized (rj0Var) {
            Iterator it = rj0Var.f29340a.iterator();
            while (it.hasNext()) {
                ((dk0) it.next()).getClass();
            }
        }
        return y62.m12936B(null);
    }
}
