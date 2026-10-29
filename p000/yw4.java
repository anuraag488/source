package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public interface yw4 {
    /* JADX INFO: renamed from: a */
    boolean mo3759a();

    /* JADX INFO: renamed from: c */
    long mo3358c(AbstractC0654fk abstractC0654fk, AbstractC0654fk abstractC0654fk2, AbstractC0654fk abstractC0654fk3);

    /* JADX INFO: renamed from: p */
    AbstractC0654fk mo4794p(long j, AbstractC0654fk abstractC0654fk, AbstractC0654fk abstractC0654fk2, AbstractC0654fk abstractC0654fk3);

    /* JADX INFO: renamed from: s */
    AbstractC0654fk mo4795s(long j, AbstractC0654fk abstractC0654fk, AbstractC0654fk abstractC0654fk2, AbstractC0654fk abstractC0654fk3);

    /* JADX INFO: renamed from: t */
    default AbstractC0654fk mo12090t(AbstractC0654fk abstractC0654fk, AbstractC0654fk abstractC0654fk2, AbstractC0654fk abstractC0654fk3) {
        return mo4794p(mo3358c(abstractC0654fk, abstractC0654fk2, abstractC0654fk3), abstractC0654fk, abstractC0654fk2, abstractC0654fk3);
    }
}
