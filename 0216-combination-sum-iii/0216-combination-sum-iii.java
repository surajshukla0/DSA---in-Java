class Solution {

    static void solve(int[] candidates, int target, int k, int count,
                      List<List<Integer>> ans, List<Integer> output, int index) {

        if (count > k || target < 0) {
            return;
        }

        if (count == k) {
            if (target == 0) {
                ans.add(new ArrayList<>(output));
            }
            return;
        }

        if (index >= candidates.length) {
            return;
        }

        // Take
        output.add(candidates[index]);

        solve(
            candidates,
            target - candidates[index],
            k,
            count + 1,
            ans,
            output,
            index + 1
        );

        output.remove(output.size() - 1);

        // Not Take
        solve(
            candidates,
            target,
            k,
            count,
            ans,
            output,
            index + 1
        );
    }

    public List<List<Integer>> combinationSum3(int k, int n) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();

        int[] candidates = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        solve(candidates, n, k, 0, ans, output, 0);

        return ans;
    }
}