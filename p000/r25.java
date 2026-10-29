package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r25 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f28974a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ long f28975b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f28976c;

    public /* synthetic */ r25(byte b) {
        this.f28974a = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) throws Exception {
        byte b = this.f28974a;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                long j = this.f28975b;
                String str = (String) this.f28976c;
                gf4 gf4VarM11888b = ((ve4) obj).m11888b("UPDATE workspec SET last_enqueue_time=? WHERE id=?");
                try {
                    gf4VarM11888b.mo5117z(1, j);
                    gf4VarM11888b.mo5109a(2, str);
                    gf4VarM11888b.mo5112g();
                    return ju4Var;
                } finally {
                    gf4VarM11888b.close();
                }
            case 1:
                long j2 = this.f28975b;
                String str2 = (String) this.f28976c;
                ve4 ve4Var = (ve4) obj;
                gf4 gf4VarM11888b2 = ve4Var.m11888b("UPDATE workspec SET schedule_requested_at=? WHERE id=?");
                try {
                    gf4VarM11888b2.mo5117z(1, j2);
                    gf4VarM11888b2.mo5109a(2, str2);
                    gf4VarM11888b2.mo5112g();
                    return Integer.valueOf(d24.m4323x(ve4Var));
                } finally {
                    gf4VarM11888b2.close();
                }
            default:
                fh2 fh2Var = (fh2) this.f28976c;
                fh2Var.f18999r.setValue(o52.m8954a(o52.m8957d(((o52) ((C0910mi) obj).m8328d()).f26352a, this.f28975b)));
                fh2Var.f18984c.invoke();
                return ju4Var;
        }
    }
}
