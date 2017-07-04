/*

Decompiled Covfefe data class

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public class CovfefeJava {
    @Metadata(
            mv = {1, 1, 6},
            bv = {1, 0, 1},
            k = 1,
            d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"},
            d2 = {"LCovfefe;", "", "first", "", "second", "(Ljava/lang/String;Ljava/lang/String;)V", "getFirst", "()Ljava/lang/String;", "getSecond", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "production sources for module kotlin_for_java_devs"}
    )
    public final class Covfefe {
        @NotNull
        private final String first;
        @NotNull
        private final String second;

        @NotNull
        public final String getFirst() {
            return this.first;
        }

        @NotNull
        public final String getSecond() {
            return this.second;
        }

        public Covfefe(@NotNull String first, @NotNull String second) {
            Intrinsics.checkParameterIsNotNull(first, "first");
            Intrinsics.checkParameterIsNotNull(second, "second");
            super();
            this.first = first;
            this.second = second;
        }

        @NotNull
        public final String component1() {
            return this.first;
        }

        @NotNull
        public final String component2() {
            return this.second;
        }

        @NotNull
        public final Covfefe copy(@NotNull String first, @NotNull String second) {
            Intrinsics.checkParameterIsNotNull(first, "first");
            Intrinsics.checkParameterIsNotNull(second, "second");
            return new Covfefe(first, second);
        }

        // $FF: synthetic method
        // $FF: bridge method
        @NotNull
        public static Covfefe copy$default(Covfefe var0, String var1, String var2, int var3, Object var4) {
            if((var3 & 1) != 0) {
                var1 = var0.first;
            }

            if((var3 & 2) != 0) {
                var2 = var0.second;
            }

            return var0.copy(var1, var2);
        }

        public String toString() {
            return "Covfefe(first=" + this.first + ", second=" + this.second + ")";
        }

        public int hashCode() {
            return (this.first != null?this.first.hashCode():0) * 31 + (this.second != null?this.second.hashCode():0);
        }

        public boolean equals(Object var1) {
            if(this != var1) {
                if(var1 instanceof Covfefe) {
                    Covfefe var2 = (Covfefe)var1;
                    if(Intrinsics.areEqual(this.first, var2.first) && Intrinsics.areEqual(this.second, var2.second)) {
                        return true;
                    }
                }

                return false;
            } else {
                return true;
            }
        }
    }

}
*/
