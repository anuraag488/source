package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class fo6 implements Cloneable {

    /* JADX INFO: renamed from: a */
    public final jo6 f19208a;

    /* JADX INFO: renamed from: b */
    public jo6 f19209b;

    public fo6(jo6 jo6Var) {
        this.f19208a = jo6Var;
        if (jo6Var.m7199f()) {
            C1077qn.m9987m("Default instance must be immutable.");
            throw null;
        }
        this.f19209b = (jo6) jo6Var.mo205g(4);
    }

    /* JADX INFO: renamed from: a */
    public final jo6 m5768a() {
        boolean zM7199f = this.f19209b.m7199f();
        jo6 jo6Var = this.f19209b;
        if (zM7199f) {
            jo6Var.getClass();
            zp6.f36259c.m13720a(jo6Var.getClass()).mo7578a(jo6Var);
            jo6Var.m7201k();
            jo6Var = this.f19209b;
        }
        jo6Var.getClass();
        boolean zMo7581d = true;
        byte bByteValue = ((Byte) jo6Var.mo205g(1)).byteValue();
        if (bByteValue != 1) {
            if (bByteValue == 0) {
                zMo7581d = false;
            } else {
                zMo7581d = zp6.f36259c.m13720a(jo6Var.getClass()).mo7581d(jo6Var);
                jo6Var.mo205g(2);
            }
        }
        if (zMo7581d) {
            return jo6Var;
        }
        throw new gf0("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    /* JADX INFO: renamed from: b */
    public final void m5769b() {
        if (this.f19209b.m7199f()) {
            return;
        }
        jo6 jo6Var = (jo6) this.f19208a.mo205g(4);
        zp6.f36259c.m13720a(jo6Var.getClass()).mo7579b(jo6Var, this.f19209b);
        this.f19209b = jo6Var;
    }

    public final Object clone() {
        fo6 fo6Var = (fo6) this.f19208a.mo205g(5);
        boolean zM7199f = this.f19209b.m7199f();
        jo6 jo6Var = this.f19209b;
        if (zM7199f) {
            jo6Var.getClass();
            zp6.f36259c.m13720a(jo6Var.getClass()).mo7578a(jo6Var);
            jo6Var.m7201k();
            jo6Var = this.f19209b;
        }
        fo6Var.f19209b = jo6Var;
        return fo6Var;
    }
}
