package p000;

import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ib4 extends qv0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ byte f21251b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ib4(Class cls, byte b) {
        super(cls);
        this.f21251b = b;
    }

    @Override // p000.qv0
    /* JADX INFO: renamed from: a */
    public final Date mo6740a(Date date) {
        switch (this.f21251b) {
            case 0:
                return new java.sql.Date(date.getTime());
            default:
                return new Timestamp(date.getTime());
        }
    }
}
