package p000;

import android.content.SharedPreferences;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class p86 {

    /* JADX INFO: renamed from: a */
    public long f27458a;

    /* JADX INFO: renamed from: b */
    public Object f27459b;

    /* JADX INFO: renamed from: c */
    public Serializable f27460c;

    /* JADX INFO: renamed from: d */
    public Serializable f27461d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ oc6 f27462e;

    public /* synthetic */ p86(qm6 qm6Var) {
        this.f27462e = qm6Var;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x009a  */
    /* JADX WARN: Code duplicated, block: B:25:0x00cd A[RETURN] */
    /* JADX INFO: renamed from: a */
    public boolean m9437a(long j, m96 m96Var) {
        int size;
        if (((ArrayList) this.f27461d) == null) {
            this.f27461d = new ArrayList();
        }
        if (((ArrayList) this.f27460c) == null) {
            this.f27460c = new ArrayList();
        }
        if (((ArrayList) this.f27461d).isEmpty() || ((((m96) ((ArrayList) this.f27461d).get(0)).m8249t() / 1000) / 60) / 60 == ((m96Var.m8249t() / 1000) / 60) / 60) {
            long jM13571i = this.f27458a + ((long) m96Var.m13571i());
            qm6 qm6Var = (qm6) this.f27462e;
            if (!qm6Var.m9950d0().m9225E(null, e56.f17783e1)) {
                qm6Var.m9950d0();
                if (jM13571i < Math.max(0, ((Integer) e56.f17796j.m4379a(null)).intValue())) {
                    this.f27458a = jM13571i;
                    ((ArrayList) this.f27461d).add(m96Var);
                    ((ArrayList) this.f27460c).add(Long.valueOf(j));
                    size = ((ArrayList) this.f27461d).size();
                    qm6Var.m9950d0();
                    if (size < Math.max(1, ((Integer) e56.f17799k.m4379a(null)).intValue())) {
                        return true;
                    }
                }
            } else if (((ArrayList) this.f27461d).isEmpty()) {
                this.f27458a = jM13571i;
                ((ArrayList) this.f27461d).add(m96Var);
                ((ArrayList) this.f27460c).add(Long.valueOf(j));
                size = ((ArrayList) this.f27461d).size();
                qm6Var.m9950d0();
                if (size < Math.max(1, ((Integer) e56.f17799k.m4379a(null)).intValue())) {
                    return true;
                }
            } else {
                qm6Var.m9950d0();
                if (jM13571i < Math.max(0, ((Integer) e56.f17796j.m4379a(null)).intValue())) {
                    this.f27458a = jM13571i;
                    ((ArrayList) this.f27461d).add(m96Var);
                    ((ArrayList) this.f27460c).add(Long.valueOf(j));
                    size = ((ArrayList) this.f27461d).size();
                    qm6Var.m9950d0();
                    if (size < Math.max(1, ((Integer) e56.f17799k.m4379a(null)).intValue())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public void m9438b() {
        s86 s86Var = (s86) this.f27462e;
        s86Var.mo5038t();
        ((oa6) s86Var.f36084a).f26519k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor editorEdit = s86Var.m10560y().edit();
        editorEdit.remove((String) this.f27460c);
        editorEdit.remove((String) this.f27461d);
        editorEdit.putLong((String) this.f27459b, jCurrentTimeMillis);
        editorEdit.apply();
    }
}
