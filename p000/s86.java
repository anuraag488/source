package p000;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class s86 extends lc6 {

    /* JADX INFO: renamed from: X */
    public static final Pair f29972X = new Pair("", 0L);

    /* JADX INFO: renamed from: L */
    public r36 f29973L;

    /* JADX INFO: renamed from: M */
    public h86 f29974M;

    /* JADX INFO: renamed from: N */
    public n86 f29975N;

    /* JADX INFO: renamed from: O */
    public n86 f29976O;

    /* JADX INFO: renamed from: P */
    public boolean f29977P;

    /* JADX INFO: renamed from: Q */
    public h86 f29978Q;

    /* JADX INFO: renamed from: R */
    public h86 f29979R;

    /* JADX INFO: renamed from: S */
    public n86 f29980S;

    /* JADX INFO: renamed from: T */
    public C1126rz f29981T;

    /* JADX INFO: renamed from: U */
    public C1126rz f29982U;

    /* JADX INFO: renamed from: V */
    public n86 f29983V;

    /* JADX INFO: renamed from: W */
    public r36 f29984W;

    /* JADX INFO: renamed from: g */
    public SharedPreferences f29985g;

    /* JADX INFO: renamed from: h */
    public SharedPreferences f29986h;

    /* JADX INFO: renamed from: i */
    public p86 f29987i;

    /* JADX INFO: renamed from: j */
    public n86 f29988j;

    /* JADX INFO: renamed from: k */
    public C1126rz f29989k;

    /* JADX INFO: renamed from: l */
    public String f29990l;

    /* JADX INFO: renamed from: m */
    public boolean f29991m;

    /* JADX INFO: renamed from: n */
    public long f29992n;

    /* JADX INFO: renamed from: o */
    public n86 f29993o;

    /* JADX INFO: renamed from: p */
    public h86 f29994p;

    /* JADX INFO: renamed from: q */
    public C1126rz f29995q;

    /* JADX INFO: renamed from: A */
    public final SparseArray m10555A() {
        Bundle bundleM10190a = this.f29973L.m10190a();
        int[] intArray = bundleM10190a.getIntArray("uriSources");
        long[] longArray = bundleM10190a.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            d76 d76Var = ((oa6) this.f36084a).f26514f;
            oa6.m9016l(d76Var);
            d76Var.f16835j.m12504a("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        SparseArray sparseArray = new SparseArray();
        for (int i = 0; i < intArray.length; i++) {
            sparseArray.put(intArray[i], Long.valueOf(longArray[i]));
        }
        return sparseArray;
    }

    /* JADX INFO: renamed from: B */
    public final xc6 m10556B() {
        mo5038t();
        return xc6.m12653c(m10560y().getInt("consent_source", 100), m10560y().getString("consent_settings", "G1"));
    }

    /* JADX INFO: renamed from: C */
    public final boolean m10557C(wk6 wk6Var) {
        mo5038t();
        String string = m10560y().getString("stored_tcf_param", "");
        String strM12319a = wk6Var.m12319a();
        if (strM12319a.equals(string)) {
            return false;
        }
        SharedPreferences.Editor editorEdit = m10560y().edit();
        editorEdit.putString("stored_tcf_param", strM12319a);
        editorEdit.apply();
        return true;
    }

    /* JADX INFO: renamed from: D */
    public final void m10558D(boolean z) {
        mo5038t();
        d76 d76Var = ((oa6) this.f36084a).f26514f;
        oa6.m9016l(d76Var);
        d76Var.f16831L.m12505b(Boolean.valueOf(z), "App measurement setting deferred collection");
        SharedPreferences.Editor editorEdit = m10560y().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z);
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: E */
    public final boolean m10559E(long j) {
        return j - this.f29993o.m8623a() > this.f29975N.m8623a();
    }

    @Override // p000.lc6
    /* JADX INFO: renamed from: u */
    public final boolean mo4615u() {
        return true;
    }

    /* JADX INFO: renamed from: y */
    public final SharedPreferences m10560y() {
        mo5038t();
        m7955v();
        y42.m12854a0(this.f29985g);
        return this.f29985g;
    }

    /* JADX INFO: renamed from: z */
    public final SharedPreferences m10561z() {
        mo5038t();
        m7955v();
        SharedPreferences sharedPreferences = this.f29986h;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        oa6 oa6Var = (oa6) this.f36084a;
        String strValueOf = String.valueOf(oa6Var.f26509a.getPackageName());
        d76 d76Var = oa6Var.f26514f;
        oa6.m9016l(d76Var);
        x66 x66Var = d76Var.f16831L;
        String strConcat = strValueOf.concat("_preferences");
        x66Var.m12505b(strConcat, "Default prefs file");
        SharedPreferences sharedPreferences2 = oa6Var.f26509a.getSharedPreferences(strConcat, 0);
        this.f29986h = sharedPreferences2;
        return sharedPreferences2;
    }
}
