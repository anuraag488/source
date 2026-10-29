package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ku5 {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f23526b = 0;

    /* JADX INFO: renamed from: a */
    public byte f23527a;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ku5)) {
            return false;
        }
        byte b = this.f23527a;
        byte b2 = ((ku5) obj).f23527a;
        if (b != 0) {
            return b == b2;
        }
        throw null;
    }

    public final int hashCode() {
        byte b = this.f23527a;
        if (b != 0) {
            return ((b ^ (-485106924)) * 583896283) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        String str;
        byte b = this.f23527a;
        if (b == 1) {
            str = "ALL_CHECKS";
        } else if (b == 2) {
            str = "SKIP_COMPLIANCE_CHECK";
        } else if (b != 3) {
            str = b != 4 ? "null" : "NO_CHECKS";
        } else {
            str = "SKIP_SECURITY_CHECK";
        }
        return c75.m3881m(new StringBuilder("READ_AND_WRITE".length() + str.length() + "".length() + 73 + 91 + 1), "FileComplianceOptions{fileOwner=, hasDifferentDmaOwner=false, fileChecks=", str, ", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=READ_AND_WRITE}");
    }
}
